import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3 ,2 , 6, 1, 8, 4};
        selection(arr, 0, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int max, int r, int c) {
        if(r == 0) return;
        if(r > c) {
            if (arr[c] > arr[max]) {
                max = c;
            }
            selection(arr, max, r, ++c);

        } else {
            selection(arr, max, --r, 0);
        }
    }
}