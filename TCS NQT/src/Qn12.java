import java.util.ArrayList;
import java.util.Scanner;

public class Qn12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = factors(n);
        if (k <= list.size()) {
            System.out.println(list.get(k));
        } else {
            System.out.println(1);
        }
    }

    static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        list.add(n);
        return list;
    }
}
