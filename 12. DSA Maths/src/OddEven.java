import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bitwiseEvenOdd(n);
    }

    static void bitwiseEvenOdd(int n) {
        if((n & 1) == 1 ) System.out.println("Odd");
        else System.out.println("Even");

    }
}
