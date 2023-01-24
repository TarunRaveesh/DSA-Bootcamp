import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
}
