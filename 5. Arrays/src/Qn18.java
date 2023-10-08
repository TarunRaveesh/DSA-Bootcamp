import java.util.*;

public class Qn18 {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        long n = 0;
        long rem = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            n += (long) (num[i] * Math.pow(10, num.length - i - 1));
        }
        n += k;
        while (n > 0) {
            rem = n % 10;
            n /= 10;
            arr.add((int) rem);
        }
        Collections.reverse(arr);
        return arr;
    }
}
