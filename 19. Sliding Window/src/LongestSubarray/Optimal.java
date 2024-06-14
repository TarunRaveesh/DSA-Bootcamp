package LongestSubarray;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // Given Sum Condition
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(slidingWindow(arr, n, k));
    }

    public static int slidingWindow(int[] arr, int n, int k) { // Sliding Window
        int maxlen = 0;
        int l = 0, r = 0;
        int sum = 0;

        while (r < n) { // Sliding Window
            sum += arr[r];
            if (sum > k) { // Check for shrink first then expand (Here if is used instead of while, only use this for max length)
                sum -= arr[l];
                l++; // Shrink Window
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++; // Expand Window
        }
        return maxlen;
    }
}
