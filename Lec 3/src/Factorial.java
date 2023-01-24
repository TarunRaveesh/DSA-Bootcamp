import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        double n = in.nextDouble();
        double fact = 1;
        for (double i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
    }
}