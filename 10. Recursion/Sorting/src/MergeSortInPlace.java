import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) { // Time: O(nlogn) Space: O(n)
        int[] arr = {5, 2, 4, 1, 3};
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeInPlace(int[] arr, int s, int e) {
        if (e - s == 1) return;
        int m = (s + e)/2;
        mergeInPlace(arr, s, m);
        mergeInPlace(arr, m, e);

        merge(arr, s, m, e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int [e - s];
        int i = s, j = m, k = 0;
        while(i < m && j < e) {
            if(arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }
        while(i < m) {
            mix[k++] = arr[i++];
        }
        while(j < e) {
            mix[k++] = arr[j++];
        }

        for (int x = 0; x < mix.length; x++) {
            arr[s+x] = mix[x];
        }
    }
}
