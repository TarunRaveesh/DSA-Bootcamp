public class DigitManipulation {
    public static void main(String[] args) {
        int n = 110200;
        System.out.println("No. of Digits = " + digits(n));
        System.out.println("Sum of Digits = " + sum(n));
        System.out.println("Product of Digits = " + prod(n));
    }
    private static int digits(int n) {
        if(n == 0) return 0;
        return 1 + digits(n/10);
    }
    private static int sum(int n) {
        if(n == 0) return 0;
        return (n%10) + sum(n/10);
    }
    private static int prod(int n) {
        if(n == 0) return 1;
        return (n%10) * prod(n/10);
    }
}



