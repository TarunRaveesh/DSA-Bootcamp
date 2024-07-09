package LongestSubarray;

import java.util.Arrays;
import java.util.Scanner;

public class Brute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // Given Sum Condition
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(LongestSubarrayLength(arr, n, k));
    }

    public static int LongestSubarrayLength(int[] arr, int n, int k) {
        int maxlen = 0;
        int s = 0, e = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum <= k) {
                    if(maxlen < j - i + 1) {
                        maxlen = j - i + 1;
                        s = i;
                        e = j;
                    }
                } else {
                    break;
                }
            }
        }
        int[] window = new int[e - s + 1];
        for (int i = 0; i < window.length; i++) {
            window[i] = arr[s + i];
        }
        System.out.println(Arrays.toString(window));
        return maxlen;
    }
}
