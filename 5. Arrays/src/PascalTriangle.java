import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(14));
    }

    static List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(pascal(i));
        }
        return arr;
    }

    static ArrayList<Integer> pascal(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            int x = nCr(n, i);
            list.add(x);
        }
        return list;
    }

    static int nCr(int n, int r) {
        int res = 1;
        for (int i = 1; i <= r; i++) {
            res *= n - i + 1;
            res /= i;
        }
        return res;
    }
}
