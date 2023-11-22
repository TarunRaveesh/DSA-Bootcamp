public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -5, -2, 0, 3, 9, 18, 22, 38, 46};
        int target = 22;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Since, (start + end) may exceed the range of int in java

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
