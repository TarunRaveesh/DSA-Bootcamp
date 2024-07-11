package Questions;

public class LISTab {
    public static void main(String[] args) {
        int[] arr =  {10, 9, 7, 3, 5, 12, 17, 101, 4, 11};
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];

        System.out.println(LIS(arr, dp));
    }

    static int LIS(int[] arr, int[][] dp) {
        int n = arr.length;
        for (int ind = n - 1; ind >= 0 ; ind--) {
            for (int prev = ind - 1; prev >= -1 ; prev--) {
                int len = dp[ind+1][prev + 1]; // Not Take Case

                if(prev == -1 || arr[ind] > arr[prev]) {
                    len =  Math.max(len, 1 + dp[ind+1][ind + 1]); // Take Case
                }
                dp[ind][prev + 1] = len;
            }
        }
        return dp[0][0];
    }
}
