import java.util.Scanner;

public class SieveOfEratosthenes { // Time: O(log(log(n)) Space:O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sieve(n);
    }
    private static void Sieve(int n) {
        boolean[] primes = new boolean[n+1];
        for (int i = 2; i * i < n; i++) {
            if(!primes[i]) {
                for(int j = i * i; j <= n; j += i) { // Multiples of Prime are being ignored by setting their
                                                     // respective index value to false

                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
