import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 5, 2, 7};
        int[] nums = arr; // both nums and arr point to the same array

        arr[0] = 9;
        arr[3] = 12;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));

        String[] words = {"hello", "tarun", "hello", "again", "world", "by", "tarun"};
        words[1] = "pawan";

        String name = "Suhail";
        name = "Ritika";

        String naam = name;

        name += " Singh";

        String[] sent = words;

        words[1] = name;

        System.out.println(Arrays.toString(words));
        System.out.println(name);
        System.out.println(naam);
        System.out.println(Arrays.toString(sent));

        String a = "Tarun";
        String b = "Tarun"; // Both a and b point to same "Tarun" object in string pool which is inside heap

        String c = new String("Tarun");
        String d = new String("Tarun"); // c and d point to different "Tarun" objects created by the new keyword in the
                                               // heap and outside string pool

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println(new int[] {1, 3, 5, 7, 9});
        System.out.println(Arrays.toString(new int[] {1, 3, 5, 7, 9})); // If Arrays.toString isn't used then we will get
        // [I@hashcode - Pity Printing, sice the println method doesnt know the taype of object it is printing

        // Also above the Arrays.toString method is overriding the toString method in the println method. Since the final terminal
        // output is always a string whenever we use sout.

        String str = null;
        System.out.println(str);

        //using wrapper class
        Integer num = new Integer(56);
        System.out.println(num.toString());
        System.out.println(num);
    }
}
