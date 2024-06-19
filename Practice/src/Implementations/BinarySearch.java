package Implementations;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 15, 26, 27, 35 };
        int target = 15;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] < target) {
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
