import java.util.Arrays;

public class Qn14 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};

        int count = 0;
        int[][] arr = new int [m][n];
        System.out.println(Arrays.deepToString(arr));

        for(int i = 0; i < indices.length; i++) {
            m = i;
            for(int j = 0; j < indices[i].length; j++) {
                n = j;
                arr[m][n]++;
                System.out.println(Arrays.deepToString(arr));
            }
        }
        System.out.println("main: " + Arrays.deepToString(arr));

        for (int[] row : arr) {
            for (int col : row) {
                if (col % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
