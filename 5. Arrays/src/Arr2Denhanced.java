import java.util.Arrays;

public class Arr2Denhanced {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2 ,3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}