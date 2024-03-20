public class RecursiveFib {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n) {
        // Base Case
        if(n < 2) {
            return n;
        }
        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }
}
