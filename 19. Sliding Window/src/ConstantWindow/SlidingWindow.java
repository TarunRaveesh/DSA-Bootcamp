package ConstantWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {3, 5, 8, 7, 5, 12, 4, 17};
        System.out.println(constantSlidingWindow(arr, k));
    }

    static int constantSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = k - 1;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxsum = sum;
        while(r < (n - 1)) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}
