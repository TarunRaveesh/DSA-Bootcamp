public class Qn3 {
        public int[] runningSum(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Sum(nums[i], nums[i - 1]);
            }
        }
}
