import java.util.Arrays;
public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        triangle(arr);
    }
    static void triangle(int[] arr) {
        //Base Case
        if (arr.length < 1) {
            return;
        }
        int[] nums = new int [arr.length - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i] + arr[i + 1];
        }
        triangle(nums);
        System.out.println(Arrays.toString(arr));
    }
}
