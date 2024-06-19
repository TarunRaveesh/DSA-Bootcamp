package ExamPrep;

import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        window(arr, k);
    }

    private static void window(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int l = 0, r = 0;

        while (r < n) {
            sum += arr[r];
            while(sum > k && l <= r) {
                sum -= arr[l];
                l++;
            }
            if(sum == k) {
                System.out.print(l + " " + r);
                return;
            }
            r++;
        }
    }
}
