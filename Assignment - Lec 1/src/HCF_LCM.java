package src;

import java.util.Scanner;

public class HCF_LCM {

    public static int LCM(int x, int y) {
        int lcm, greater;
        greater = Math.max(x, y);

        while(true) {
            if (greater % x == 0 && greater % y == 0) {
                lcm = greater;
                break;
            }
            greater += 1;
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
