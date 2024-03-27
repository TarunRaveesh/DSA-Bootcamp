public class Palindrome {
    public static void main(String[] args) {
        int n = 103001;
        System.out.println(pal(n));
    }
    static int rev(int n) { // Sometimes u might need additional variables in the argument, in such case use a helper function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n , digits);
    }
    static int helper(int n, int digits) {
        if(n%10 == n) return n;
        int rem = n % 10;
        return (rem * ((int) Math.pow(10, (digits - 1))) + helper(n/10, digits - 1));
    }
    static boolean pal(int n) {
        return (n == rev(n));
    }
}
