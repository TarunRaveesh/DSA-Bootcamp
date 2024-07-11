package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAnagrams {
    public static void main(String[] args) {
        String[] arr = { "cat", "dog", "tac", "god", "act" };
        giveAnagrams(arr);
    }

    private static void giveAnagrams(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : arr) {
            String unique = sort(s);
            if (!map.containsKey(unique)) {
                map.put(unique, new ArrayList<String>());
            }
            map.get(unique).add(s);
        }

        System.out.println(map);

        for (List<String> list : map.values()) {
            for (String word : list) {
                System.out.print(word + " ");
            }
        }
    }

    private static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}