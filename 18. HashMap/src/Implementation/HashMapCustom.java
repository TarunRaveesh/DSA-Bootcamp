package Implementation;

import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings("ALL")
public class HashMapCustom <K, V> {
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private final float lf = 0.5f;

    public HashMapCustom() {
        int DEFAULT_SIZE = 10;
        this.list = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            list.add(new LinkedList<>());
        }
    }

    private static class Entity<K, V> {
        public final K key;
        public V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> innerList = list.get(hash);

        for (Entity item : innerList) {
            if (item != null && item.key.equals(key)) {
                item.value = value;
                return;
            }
        }

        if ((float) (size) / list.size() > lf) {
            reHash();
        }

        innerList.add(new Entity<>(key, value));
        size++;
    }

    private void reHash() {
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : old) {
            for (Entity entry : entries) {
                put((K) entry.key, (V) entry.value);
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> innerList = list.get(hash);

        for (Entity item : innerList) {
            if (item != null && item.key.equals(key)) {
                return (V) item.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> innerList = list.get(hash);

        Entity target = null;
        for (Entity item : innerList) {
            if (item != null && item.key.equals(key)) {
                target = item;
                break;
            }
        }
        innerList.remove(target);
        return (V) target.value;
    }

    public boolean containsKey(K key) {
        return (get(key) != null);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        for(LinkedList<Entity> innerList : list) {
            for(Entity item : innerList) {
                builder.append(item.key);
                builder.append(" = ");
                builder.append(item.value);
                builder.append(", ");
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

        System.out.println(map);
    }
}
