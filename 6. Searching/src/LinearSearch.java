public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {36, 8, 1, 21, 9, 27, 41, 81, 12, 32};
        int target = 41;
        int ls = linearSearch(arr, target);
        int lsr = SearchInRange(arr, target, 2, 8);
        System.out.println(ls);
        System.out.println(lsr);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    static int SearchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
