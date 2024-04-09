import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Subset { //Iteration // Time : O(n.2^n) // Space : O(n.2^n) ------> 2^n is for the no of subsets for both
    // n for time is the no of times the outer loop iterates, i.e. no of elements in the original array
    // n for space is bcz size of the subsets will be an auxiliary space of n since the last subset will contain the initial array too
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> ls : ans) {
            System.out.print(ls + " ");
        }
        System.out.println();

        int[] nums = {1, 2, 2, 2, 3, 3};
        List<List<Integer>> sol = subsetDuplicates(nums);
        for (List<Integer> ls : sol) {
            System.out.print(ls + " ");
        }
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>(1 << arr.length); // 2^n capacity
        outer.add(new ArrayList<>());
        System.out.println(outer.size());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // outer.get(i) makes sure that
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>(1 << arr.length); // 2^n capacity
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            // If current and previous element is same s = e + 1
            if(i > 0 && arr[i - 1] == arr[i]) {
                start = end + 1;
            }
            end = outer.size() - 1; // Since the start of the next iteration should be the one after the initial subsets formed by the previous element
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
