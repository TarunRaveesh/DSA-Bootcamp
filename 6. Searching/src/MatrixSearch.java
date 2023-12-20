import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {12, 23, 31, 42},
            {15, 25, 37, 45},
            {18, 27, 39, 47}};
        System.out.println(Arrays.toString(bs(arr, 30)));
    }

    static int[] bs(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] {r, c};
            } else if (arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[] {-1, -1};
    }
}
