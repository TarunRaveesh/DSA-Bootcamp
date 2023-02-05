import java.util.Scanner;

public class Num_Pal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        Palindrome(n);
    }

    static void Palindrome(int n) {
        int N1 = n, N2 = n, sum = 0, rem = 0, digits = 0;
        while(N1 > 0) {
            N1 /= 10;
            digits++;
        }
        while(N2 > 0) {
            rem = N2 % 10;
            N2 /= 10;
            sum += rem * Math.pow(10, (digits-1));
            digits--;
        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
