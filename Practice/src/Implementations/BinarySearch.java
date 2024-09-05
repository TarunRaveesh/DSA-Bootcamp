package Implementations;

import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 1, 12, 8, 15, 11, 18, 21};
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) return m;
            else if (arr[m] > target) e = m - 1;
            else s = m + 1;
        }
        return -1;
    }
}