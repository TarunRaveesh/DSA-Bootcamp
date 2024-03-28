public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9, 14, 2, 54, 23, 12, 16};
        System.out.println(find(arr, 14, 0));
        System.out.println(findIndex(arr, 54, 0));
        System.out.println(findIndexLast(arr, 12, arr.length - 1));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return arr[index] == target || find(arr, target, ++index);
    }
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if(arr[index] == target) return index;
        else return findIndex(arr, target, ++index);
    }
    static int findIndexLast(int[] arr, int target, int index) {
        if (index < 0) return -1;
        if(arr[index] == target) return index;
        else return findIndexLast(arr, target, --index);
    }
}
