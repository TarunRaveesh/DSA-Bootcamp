import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3 ,2 , 6, 1, 8, 4};
        selection(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int max, int r, int c) {
        if(r == 0) return;
        if(r > c) {
            if (arr[c] > arr[max]) {
                selection(arr, c, r, ++c);
            } else {
                selection(arr, max, r, ++c);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, 0, --r, 0);
        }
    }
}
