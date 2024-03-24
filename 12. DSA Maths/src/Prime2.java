public class Prime2 {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 1; i <= 40; i++) {
            if(Prime.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
