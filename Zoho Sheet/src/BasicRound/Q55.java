package BasicRound;

public class Q55 { // Pascal Triangle
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            if(i < 5) System.out.print(" ");
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print(comb(i, k));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int fact(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    static int comb(int n, int r) {
        if(r == 0) return 1;
        return fact(n) / (fact(n - r) * fact(r));
    }
}
