public class findInBitonicArray {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;
        int ans = findInMountainArray(target, arr);
        System.out.println(ans);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakSearch(mountainArr);
        int s = 0;
        int e = peak;
        int ans = findTarget(mountainArr, s, e, target);
        if (ans == -1) {
            s = peak + 1;
            e = mountainArr.length - 1;
            ans = findTarget(mountainArr, s, e, target);
        }
        return ans;
    }

    public static int peakSearch(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        s
        return s;
    }

    public static int findTarget(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target < nums[m]) {
                e = m - 1;
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
