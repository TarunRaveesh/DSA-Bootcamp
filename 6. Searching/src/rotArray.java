public class rotArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 9, 0, 1, 3};
        int ans = pivotSearch(arr, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int pivotSearch(int[] arr, int s, int e) {
        while(s <= e) {
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m + 1]) return m;
            if (m > s && arr[m - 1] > arr[m]) return m - 1;

            if (arr[s] >= arr[m]) e = m - 1;
            else s = m + 1;
        }
        return -1;
    }
}