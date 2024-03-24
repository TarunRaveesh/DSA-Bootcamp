public class SetBits {
    public static void main(String[] args) {
        int n = 4876;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits1(n));
        System.out.println(setBits2(n));
    }
    private static int setBits1(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n -= n & -n; // (n & -n) gives u the right most set bit, then subtracting it from n will remove that 1 from it's
                         // binary representation and we can repeat this till we subtract all the 1's from n's binary form
                         // to give the count eventually
        }
        return count;
    }

    private static int setBits2(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n &= n - 1; // Used for Power of 2, refer notes or search in ChatGPT
        }
        return count;
    }
}
