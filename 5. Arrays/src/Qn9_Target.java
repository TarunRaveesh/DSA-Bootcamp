import java.util.ArrayList;
import java.util.Arrays;

public class Qn9_Target {
    public static void main(String[] args) {
        int[] index = {0,1,2,2,1};
        int[] nums = {0,1,2,3,4};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int [nums.length];

        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for(int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
