package ExamPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn14 { // Square Free No - No prime factor can divide twice
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        ArrayList<Integer> factors = findFactors(n);

        for(int factor : factors) {
            if(isSquareFree(factor)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isSquareFree(int n) {
        if (n % 2 == 0)
            n = n / 2;
        // If 2 again divides n, then n is not a square free number.
        if (n % 2 == 0)
            return false;
        // n must be odd at this point. So we can skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            // Check if i is a prime factor
            if (n % i == 0) {
                n = n / i;
                // If i again divides, then n is not square free
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> findFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
