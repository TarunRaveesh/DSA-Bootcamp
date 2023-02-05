import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert 2 numbers to find Primes in between them: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The Prime Nos are: ");
        for (int i = a; i <= b; i++) {
            boolean ans = isPrime(i);
            if (ans) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return i * i > n;
    }
}
