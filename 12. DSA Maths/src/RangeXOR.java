public class RangeXOR {
    public static void main(String[] args) {
        int a = 3, b = 9;
        // RangeXOR from a to b = XOR(b) ^ XOR(a - 1)
        int ans1 = XOR(b) ^ XOR(a - 1);
        System.out.println(ans1);

        // Check only will give TLE for Large Numbers
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    // XOR from 0 to a
    static int XOR(int a) {
        if(a % 4 == 0) return a;
        if(a % 4 == 1) return 1;
        if(a % 4 == 2) return a + 1;
        return 0;
    }
}