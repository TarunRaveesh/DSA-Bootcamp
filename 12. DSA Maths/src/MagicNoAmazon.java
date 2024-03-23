public class MagicNoAmazon {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(MagicNo(i) + " ");
        }
    }
    static int MagicNo(int n) {
        int ans = 0;
        int base = 5;
        while(n > 0) {
            int last = n & 1;
            ans += last * base;
            n >>= 1;
            base *= 5;
        }
        return (ans);
    }
}
