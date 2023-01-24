import java.util.Scanner;
// Subtract the Product and Sum of Digits of an Integer
public class Difference {
    public static int Diff(int n) {
        int prod = 1, sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            prod *= rem;
            sum += rem;
            n /= 10;
        }
        System.out.println("Product = " + prod);
        System.out.println("Sum = " + sum);
        System.out.print("Difference = ");
        return (prod - sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Integer: ");
        int n = in.nextInt();
        System.out.println(Diff(n));
    }
}

