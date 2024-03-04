import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        System.out.println(Arrays.toString(search(arr, 12)));
    }

    static int[] binarySearch (int[][] matrix, int row, int target, int cStart, int cEnd) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search (int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix, 0, target, 0, cols - 1);
        }

        // Run loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have 2 final rows
        //1. check if the target is in the cMid column
        if(matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1, cMid};
        }

        //2. Now search in the 4 halves
        if(target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, target, 0, cMid - 1);
        }
        if(target >= matrix[rStart][cMid + 1]  && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, target, cMid + 1, cols -1);
        }
        if(target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart+ 1, target, 0, cMid - 1);
        }
        else {
            return binarySearch(matrix, rStart + 1, target, cMid + 1, cols - 1);
        }
    }
}