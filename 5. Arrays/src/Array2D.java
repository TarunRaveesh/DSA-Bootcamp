import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Length = " + arr.length);

        for(int row = 0; row < arr.length; row++) {             // Iterating no of rows
            for(int col = 0; col < arr[row].length; col++) {    // For every row iterating each column of the 2D array
                arr[row][col] = in.nextInt();
            }
        }

/*        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
          }
*/

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.deepToString(arr));
        }
    }
}