import java.util.Scanner;

public class FIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double p = sc.nextInt();
        System.out.print("Enter the interest rate: ");
        double r = sc.nextInt();
        System.out.print("Enter the time period in years: ");
        double y = sc.nextInt();

        double fv = p * Math.pow((1 - r/100), y);
    }
}
