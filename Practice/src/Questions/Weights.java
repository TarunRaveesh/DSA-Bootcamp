package Questions;

import java.util.*;

public class Weights {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(36);
        set.add(54);
        set.add(89);
        set.add(12);
        
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Object[] arr = set.toArray();
        Arrays.sort(arr);

        for(Object e : arr) {
            map.put((Integer) e, findWeight((Integer) e));
        }

        System.out.println(map);
    }

    static int findWeight(int num) {
        int w = 0;
        if(isPerfectSq(num)) {
            w = 5;
        } else if (num % 4 == 0 && num % 6 == 0) {
            w = 4;
        } else if (num % 2 == 0) {
            w = 3;
        }
        return w;
    }

    static boolean isPerfectSq(int n) {
         int sqRoot= (int) Math.sqrt(n);
         return (sqRoot * sqRoot == n);
    }
}
