package Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        // Step 1: Find the break point:
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                idx = i; // index i is the break point
                break;
            }
        }
        // If break point does not exist:
        if(idx == -1) { // No dip, hence reverse whole array
            reverse(nums, 0, n - 1);
            return;
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
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
