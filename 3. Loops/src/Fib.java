import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int c = 1;
        System.out.print("0 1");
        for (int i = 2; i <= n; i++) {
            int temp = c;
            c = p + c;
            p = temp;
            System.out.print(" " + c);
        }
    }
}
