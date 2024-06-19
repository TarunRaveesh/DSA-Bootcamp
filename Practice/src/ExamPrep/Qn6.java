package ExamPrep;

import java.util.*;

public class Qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        System.out.println(minimumOperations(N, A, B));
        sc.close();
    }

    public static int minimumOperations(int n, String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        int ops = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                if (i < n - 1 && A[i + 1] != B[i + 1]) {
                    char temp = A[i]; // Swap i and i + 1 characters
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    ops++;
                }
                else {
                    ops++;
                }
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        return ops;
    }
}
