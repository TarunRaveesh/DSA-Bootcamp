package Memoization;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static int fib(int n, int[] dp) {
        // Base Case
        if(n <= 1) {
            return n;
        }
        // Memoization Check
        if(dp[n] != -1) {
            return dp[n];
        }
        // Recursive Case
        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Nth Fib no
        int[] dp = new int[n + 1]; // 0 to n => n + 1
        Arrays.fill(dp, -1); // Initialize all the indices to -1 for Memoization
        System.out.println(fib(n, dp));
    }
}
