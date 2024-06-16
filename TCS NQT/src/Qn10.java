import java.util.ArrayList;
import java.util.Arrays;

public class Qn10 {
    public static void main(String[] args) {
        int n = 20;
        ArrayList<Integer> list = new ArrayList<>();
        allPrimes(n, list);

        int[] prefix = new int[list.size() + 1]; // Prefix Array
        for (int i = 0; i < list.size(); i++) {
            prefix[i+1] = prefix[i] + list.get(i);
        }
        int count = 0;
        for (int x : prefix) {
            if (list.contains(x)) {
                count++;
            }
        }
        System.out.println(count - 1); // removing 2
    }

    static void allPrimes(int n, ArrayList<Integer> list) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i * i < n; i++) {
            if(!primes[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    primes[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(!primes[i]) {
                list.add(i);
            }
        }
    }
}