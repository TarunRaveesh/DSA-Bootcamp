public class FibSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int fib(int n) {
        // Base Case
        if (n < 2) {
            return n;
        }
        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }
}