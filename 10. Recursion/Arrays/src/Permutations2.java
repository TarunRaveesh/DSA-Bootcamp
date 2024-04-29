import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3};
        boolean[] map = new boolean[arr.length];
        List<Integer> list = new ArrayList<>();
        permute(arr, list, map);
    }

    static void permute(int[] arr, List<Integer> ds, boolean[] map) {
        if(ds.size() == arr.length) {
            System.out.print(ds + " ");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!map[i]) {
                map[i] = true;
                ds.add(arr[i]);
                permute(arr, ds, map);
                ds.remove(ds.size() -1);
                map[i] = false;
            }
        }
    }
}
