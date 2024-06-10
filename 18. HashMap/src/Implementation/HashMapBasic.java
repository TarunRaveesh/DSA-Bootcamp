package Implementation;

import java.util.Arrays;

public class HashMapBasic <K, V> {
    private final Entity<K, V>[] table;

    @SuppressWarnings("unchecked")
    public HashMapBasic() {
        table = (Entity<K, V>[]) new Entity[10];
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

    // Put
    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % table.length);
        table[hash] = new Entity<>(key, value); // Will override if same hash (Not Optimized)
    }

    // Get
    public V get(K key) {
        int hash = key.hashCode() % table.length;
        Entity<K, V> entry = table[hash];
        if(table[hash] != null && entry.key.equals(key)) {
            return entry.value;
        }
        return null;
    }

    // Remove
    public void remove(K key) {
        int hash = key.hashCode() % table.length;
        Entity<K, V> entry = table[hash];
        if(table[hash] != null && entry.key.equals(key)) {
            table[hash] = null;
        }
    }

    //Override toString
    @Override
    public String toString() {
        return Arrays.toString(table);
    }

    public static void main(String[] args) {
        HashMapBasic<Integer, String> map = new HashMapBasic<>();

        map.put(0, "Tarun");
        map.put(1, "Pawan");
        map.put(2, "Kunal");
        map.put(3, "Suhail");
        map.put(4, "Ritika");

        System.out.println(map);
    }
}
