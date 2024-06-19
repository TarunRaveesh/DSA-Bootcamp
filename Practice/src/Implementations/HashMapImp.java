package Implementations;

import java.util.*;

@SuppressWarnings("unchecked")
public class HashMapImp <K, V> {
    
    private Entity<K, V>[] table;
    static final int DEFAULT_SIZE = 10; 
    private int size = 0;

    
    public HashMapImp() {
        table = new Entity[DEFAULT_SIZE];
    }

    private class Entity <K, V> {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }




}