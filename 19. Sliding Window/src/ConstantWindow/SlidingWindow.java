package ConstantWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {3, 5, 8, 7, 5, 12, 4};

        int currsum = 0;

        for (int i = 0; i < k; i++) {
            currsum += arr[i];
        }
        int maxsum = currsum;
        for (int i = k; i < arr.length; i++) { // Sliding Window
            currsum -= arr[i - k];
            currsum += arr[i];
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println(maxsum);
    }
}
