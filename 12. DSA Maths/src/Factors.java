import java.util.*;

public class Factors {
    public static void main(String[] args) { // Time: O(sqrt(n))
        System.out.print("Input No: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factors(n);

    }
    static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if(i != n /i) list.add(n / i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
