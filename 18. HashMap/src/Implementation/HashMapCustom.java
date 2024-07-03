package Implementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCustom <K, V> {
    private ArrayList<LinkedList<Entity<K, V>>> table;
    private int size = 0;
    protected final float lf = 0.75f;

    public HashMapCustom() {
        final int DEFAULT_SIZE = 10;
        this.table = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            table.add(new LinkedList<>());
        }
    }

    private static class Entity<K, V> {
        public final K key;
        public V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return (key + "=" + value);
        }
    }

    public int getHash(K key) {
        return (key.hashCode() & 0x7fffffff) % table.size(); // & with Integer.MAX_VALUE ensures hash remains +ve
    }

    public void put(K key, V value) {
        if ((float) (size + 1) / table.size() > lf) { // +1 for next element being put
            reHash();
        }
        int hash = getHash(key);
        LinkedList<Entity<K, V>> innerList = table.get(hash);

        for (Entity<K, V> item : innerList) {
            if (item != null && item.key.equals(key)) {
                item.value = value;
                return;
            }
        }

        innerList.add(new Entity<>(key, value));
        size++;
    }

    private void reHash() {
        ArrayList<LinkedList<Entity<K, V>>> old = table;
        table = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            table.add(new LinkedList<>());
        }

        size = 0;
        for (LinkedList<Entity<K, V>> entries : old) {
            for (Entity<K, V> entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

    public V get(K key) {

        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int hash = getHash(key);
        LinkedList<Entity<K, V>> innerList = table.get(hash);

        for (Entity<K, V> item : innerList) {
            if (item != null && item.key.equals(key)) {
                return item.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int hash = getHash(key);
        LinkedList<Entity<K, V>> innerList = table.get(hash);

        Entity<K, V> target = null;
        for (Entity<K, V> item : innerList) {
            if (item != null && item.key.equals(key)) {
                target = item;
                break;
            }
        }
        if (target != null) {
            innerList.remove(target);
            size--;
            return target.value;
        } else {
            return null;
        }
    }

    public boolean containsKey(K key) {
        return (get(key) != null);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        boolean first = true;
        for (LinkedList<Entity<K, V>> innerList : table) {
            for (Entity<K, V> item : innerList) {
                if (!first) {
                    builder.append(", ");
                }
                builder.append(item);
                first = false;
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        HashMapCustom<String, String> map = new HashMapCustom<>();

        map.put("A", "Tarun");
        map.put("B", "Kunal");
        map.put("C", "Ritika");
        map.put("A", "Suhail");
        map.put("D", "Pawan");

        System.out.println(map.remove("A"));
        System.out.println(map.containsKey("C"));
        System.out.println(map);
    }
}
