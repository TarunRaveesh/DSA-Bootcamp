package DSMethods;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String name = "Tarun";
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, String> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        set.add(5);
        set.add(2);
        set.add(1);
        set.add(7);
        set.add(3);
        set.add(6);
        int x = set.iterator().next();
        System.out.println(set);
        System.out.println(x);
        final var contains = set.contains(3);
        System.out.println(contains);

        minHeap.add(4);
        minHeap.add(1);
        minHeap.add(2);

        System.out.println(minHeap);

        map.put(2, "Hi");
        map.put(3, "Hii");
        map.put(4, "Hiii");
        System.out.println(map.getOrDefault(2, "") + 1);
    }
}
