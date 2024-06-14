package ConstantWindow;

public class BruteForce {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {3, 5, 8, 7, 5 ,12 , 4};
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - k; i++) {
            int currsum = 0;
            for (int j = 0; j < k; j++) {
                currsum += arr[i + j];
                maxsum = Math.max(currsum, maxsum);
            }
        }
        System.out.println(maxsum);
    }
}
