package Implementations;
import javax.swing.text.html.parser.Entity;
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
}