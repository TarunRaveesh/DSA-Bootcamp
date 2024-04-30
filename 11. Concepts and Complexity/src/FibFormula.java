public class FibFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static long fib(long n) {
        // Equation for nth fibonacci number
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
