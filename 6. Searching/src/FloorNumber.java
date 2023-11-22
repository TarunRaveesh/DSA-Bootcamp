public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {-16, -10, -7, -4, 0, 2 , 5, 12, 14, 19, 22, 25, 32, 45, 66};
        int target = -9;
        int ans = FindFloor(arr, target);
        System.out.println(ans);
    }

    static int FindFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end] || target < arr[start]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return end;
    }
}