import java.util.Arrays;
import java.util.Scanner;
public class RevSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int [6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    static void reverse (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        for (int i = start; i <= end; i++) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
