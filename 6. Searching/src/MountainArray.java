public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 7, 0, -1};
        int x = peakSearch(arr);
        System.out.println(x);
    }

    static int peakSearch(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2; // Since, (s + e) may exceed the range of int in java
            if (arr[m] > arr[m + 1]) e = m - 1;
            else s = m + 1;
        }
        return s;
    }
}