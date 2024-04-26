package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>(); // Vectors are synchronized ArrayList, i.e. only one thread can access it.
        // ArrayList can be accessed by multiple threads at once, hence it's more efficient.
    }
}
