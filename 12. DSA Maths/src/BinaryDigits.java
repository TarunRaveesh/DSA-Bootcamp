import java.util.Scanner;

public class BinaryDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input No: ");
        int n = sc.nextInt();
        System.out.print("Insert Base: ");
        int base = sc.nextInt();

        int digits = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.printf("No of Digits for %d in Base %d = %d", n, base, digits);
    }
}
