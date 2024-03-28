public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 10, 23};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr, int p) {
        if (p == arr.length - 1) return true;
        return (arr[p] < arr[p + 1]) && (sorted(arr, ++p));
    }
}
