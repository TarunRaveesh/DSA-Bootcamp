package Arrays;

public class SetMatrixZeros {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int row0 = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = -1;
                    arr[0][j] = -1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][0] == -1 || arr[0][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
