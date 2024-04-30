import java.util.ArrayList;
import java.util.List;

public class Permutations3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        perm(list, arr);
    }

    static void perm(List<Integer> list, int[] arr) {
        if (arr.length == 0) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            List<Integer> newList = new ArrayList<>(list);
            newList.add(arr[i]);

            int[] newArr = new int[arr.length - 1];
            for (int j = 0, k = 0; j < arr.length; j++) {
                if (j != i) {
                    newArr[k++] = arr[j];
                }
            }

            perm(newList, newArr);
        }
    }
}
