import java.util.*;
public class uniqueOcc {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        uniqueOccurrences(arr);
    }

    static boolean uniqueOccurrences(int[] arr) {
        int count = 1;
        Arrays.sort(arr);
        ArrayList<Integer> occ = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (occ.contains(count)) {
                    return false;
                }
                occ.add(count);
                count = 1;
            }

            if (arr.length - 1 == i) {
                if (occ.contains(count)) {
                    return false;
                }
                occ.add(count);
            }
        }
        return true;
    }
}
