import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corrected = arr[i] - 1;
            if (arr[i] != arr[corrected]) {
                swap(arr, i, corrected);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
