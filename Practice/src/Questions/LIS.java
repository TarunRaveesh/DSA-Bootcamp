package Questions;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 3, 5, 12, 17, 101, 4, 11};
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(f(arr, 0, -1, dp));
    }

    private static int f(int[] arr, int ind, int prev, int[][] dp) {
        if(ind == arr.length) {
            return 0;
        }
        if(dp[ind][prev + 1] != - 1) {
            return dp[ind][prev + 1];
        }
        int len = f(arr, ind+1, prev, dp); // Not Take Case

        if(prev == -1 || arr[ind] > arr[prev]) {
            len =  Math.max(len, 1 + f(arr, ind+1, ind, dp)); // Take Case
        }

        return dp[ind][prev + 1] = len;
    }
}
