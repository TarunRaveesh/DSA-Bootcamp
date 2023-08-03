public class Qn16_EvenDigits {
    public static void main(String[] args) {
        int[] arr = {437,315,322,431,686,264,442};
        int n = findNumbers(arr);
        System.out.println(n);
    }
    static int findNumbers(int[] nums) {
        int n = 0, digits = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                nums[i] /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
