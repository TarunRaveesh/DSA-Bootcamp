package Arrays;

import java.util.Arrays;

public class ProdExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1); // Initialize the array with 1

        int prod = 1;
        for (int i = 0; i < n; i++) {
            arr[i] *= prod;
            prod *= nums[i];
        }

        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] *= prod;
            prod *= nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        ProdExceptSelf solution = new ProdExceptSelf();
        int[] nums = {1, 2, 3, 4, 5}; // Example input array
        int[] result = solution.productExceptSelf(nums);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Output array: " + Arrays.toString(result));
    }
}
