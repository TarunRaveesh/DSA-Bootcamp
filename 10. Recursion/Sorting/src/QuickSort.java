import java.util.Arrays;

public class QuickSort {

//     Time: Avg - O(nlogn)
//     Worst: O(n^2) - When the function calls constantly perform poor due to bad pivot selection

//     Space: O(log n) on average and O(n) in the worst case.

//     The space complexity is determined by the maximum depth of the function call stack, which is log n in the
//     average case (when the array is evenly divided) and n in the worst case (when the array is already sorted or
//     reverse sorted, leading to unbalanced partitions).
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 6, 9, 3, 2, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;

        int s = low, e = high;
        int m = s + (e - s)/2;
        int p = arr[m];

        while (s <= e) { // If it already sorted it will not swap below unlike merge sort
            while (arr[s] < p) s++;
            while (arr[e] > p) e--;

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
