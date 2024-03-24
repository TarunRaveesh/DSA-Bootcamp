public class Power {
    public static void main(String[] args) {
        int base = 3, power = 6; // base and power
        int ans = 1;
        while(power > 0) {
            if((power & 1) == 1) {
                ans *= base;
            }
            power >>= 1;
            base *= base;
        }

        System.out.println(ans);
    }
}
