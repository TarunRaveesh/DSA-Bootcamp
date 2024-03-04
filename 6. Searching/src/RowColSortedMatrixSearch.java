import java.util.Arrays;

public class RowColSortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return new int[] {row, col};
            }
            if (target > matrix[row][col]){
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}