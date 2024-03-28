public class CountZeros {
    public static void main(String[] args) {
        int n = 20030903;
        System.out.println(count(n));
    }
    static int count(int n) {
        return helper(n, 0);
    }

    // Special Example, how to pass a value to above calls.
    static int helper(int n, int c) {
        if(n == 0) return c;
        int rem = n % 10;
        if(rem == 0) return helper(n/10, ++c);
        else return helper(n/10, c);
    }
}
