package Basics;

import java.util.HashMap;
import java.util.HashSet;

public class Inbuilt {
    public static void main(String[] args) {
//      HashMap
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Tarun", 96);
        map.put("Pawan", 95);
        map.put("Kunal", 88);
        map.put("Riya", 100);
        map.put("Nikita", 100);

        System.out.println(map.getOrDefault("Pawan", 0));
        System.out.println(map.getOrDefault("Alok", 0));
        System.out.println(map.getOrDefault("Riya", 0));
        System.out.println(map.getOrDefault("Nikita", 0));
        System.out.println(map.containsKey("Kunal"));
        System.out.println(map.containsValue(100));

        System.out.println(map);

//      HashSet
        HashSet<Integer> set = new HashSet<>(); // Only takes unique elements

        set.add(11);
        set.add(12);
        set.add(17);
        set.add(12);
        set.add(15);
        set.add(21);
        set.add(25);

        System.out.println(set);
    }
}
