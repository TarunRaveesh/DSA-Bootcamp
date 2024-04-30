package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(nextPermutation(arr)));
        }

    }
    static int[] nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        // Step 1: Find the break point:
        for(int i = n - 2; i >= 0; i--) { // Min index t have a dip is (n-2) second last element of array
            if(nums[i] < nums[i + 1]) {
                idx = i; // index i is the break point
                break;
            }
        }
        // If break point does not exist:
        if(idx == -1) { // No dip, hence reverse whole array
            reverse(nums, 0, n - 1);
            return nums;
        }

        // Step 2: Find the next greater element and swap it with arr[idx]:
        for(int i = (n - 1); i > idx; i--) {
            if(nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }
        // Step 3: reverse the right half:
        reverse(nums, idx + 1, n - 1);
        return nums;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
