import java.util.Scanner;

public class Mul_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mul Table of ");
        int n = in.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
