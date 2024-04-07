import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) { // Time: O(nlog(n))
        int[] arr = {12, 5, 8, 6, 9, 3, 2, 10};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[]arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] a, int[] b) {
        int[] m = new int [a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                m[k] = a[i];
                i++;
            } else {
                m[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length) {
            m[k] = a[i];
            k++;
            i++;
        }
        while(j < b.length) {
            m[k] = b[j];
            k++;
            j++;
        }
        return m;
    }
}
