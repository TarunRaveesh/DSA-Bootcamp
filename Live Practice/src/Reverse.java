import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        while (n > 0) {
            m = n % 10;
            n /= 10;
            System.out.print(m);
        }
    }
}
