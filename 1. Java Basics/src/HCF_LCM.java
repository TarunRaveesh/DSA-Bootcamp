import java.util.Scanner;

public class HCF_LCM {
    public static int LCM(int x, int y) {
        int lcm, i;
        i = Math.max(x, y);

        while(true) {
            if (i % x == 0 && i % y == 0) {
                lcm = i;
                break;
            }
            i += 1;
        }
        return lcm;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("LCM = " + LCM(a, b));
        System.out.println("HCF = " + ((a * b)/LCM(a, b)));
    }
}
