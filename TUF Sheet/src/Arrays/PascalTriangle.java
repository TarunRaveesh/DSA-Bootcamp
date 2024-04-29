package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(generateRow(i));
        }
        System.out.println(arr);
    }

    static List<Integer> generateRow(int row) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ans = 1;
        for (int i = 0; i < row; i++) {
            ans *= (row - i);
            ans /= i + 1;
            list.add(ans);
        }
        return list;
    }
}
