public class Reverse {
    static int sum = 0;
    public static void main(String[] args) {
        int n = 1824;
        // Method 1
        rev(n);
        System.out.println();

        // Method 2
        rev2(n);
        System.out.println(sum);

        // Method 3
        System.out.println(rev3(n));
    }
    static void rev(int n) {
        if (n == 0) return;
        System.out.print((n % 10));
        rev(n/10);
    }
    static void rev2(int n) {
        if (n == 0) return;
        sum = (sum * 10) + (n%10);
        rev2(n/10);
    }

    static int rev3(int n) { // Sometimes u might need additional variables in the argument, in such case use a helper function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n , digits);
    }

    static int helper(int n, int digits) {
        if(n % 10 == n) return n;
        int rem = n % 10;
        return (rem * ((int) Math.pow(10, (digits - 1))) + helper(n/10, digits - 1));
    }
}
