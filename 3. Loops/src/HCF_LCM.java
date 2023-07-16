import java.util.Scanner;

public class HCF_LCM {
    static int HCF(int a, int b) {
        int hcf = 1, max;
        max = Math.max(a, b);
        for (int i = 1; i <= (max/2); i++) {
            if ((a % i == 0) && (b % i == 0)) {
                hcf = i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int HCF = HCF(a, b);
        int LCM = (a * b)/(HCF);
        System.out.println("HCF = " + HCF);
        System.out.println("LCM = " + LCM);
    }
}