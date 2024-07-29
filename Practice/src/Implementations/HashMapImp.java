package Implementations;
import java.util.*;

public class HashMapImp <K, V> {
    private ArrayList<LinkedList<Entity<K, V>>> table;
    private int size = 0;
    private final float LF = 0.75f;

    public HashMapImp() {
        int DEFAULT_SIZE = 10;
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
            return (key + " = " + value);
        }
    }

    public int getHash(K key) {
        return (key.hashCode() & 0x7ffffff) % table.size();
    }       
    public void put(K key, V value) {
        if((float) (size + 1 / table.size()) > LF) {
            reHash();
        }

        int hash = getHash(key);
        LinkedList<Entity<K, V>> innerList = table.get(hash);

        for(Entity<K, V> item : innerList) {
            if(item != null && item.key.equals(key)) {
                item.value = value;
                return;
            }
        }

        innerList.add(new Entity<>(key, value));
        size++;
    }

    public void reHash() {
        ArrayList<LinkedList<Entity<K, V>>> old = table;
        table = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            table.add(new LinkedList<>());
        }

        size = 0;
        for (LinkedList<Entity<K, V>> entries : old) {
            for(Entity<K, V> entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }
}