import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3};
        perm(arr, 0);
    }

    static void perm(int[] arr, int idx) {
        if(idx == arr.length) {
            System.out.print(Arrays.toString(arr) + " ");
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            perm(arr, idx + 1);
            swap(arr, idx, i); // backtrack
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
