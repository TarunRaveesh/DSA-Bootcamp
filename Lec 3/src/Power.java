import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Integer: ");
        int n = in.nextInt();
        System.out.print("Input Power: ");
        int m = in.nextInt();

        double pow = Math.pow(n, m);
        System.out.println(n + " to the power of " + m + " is: " + pow);
    }
}
