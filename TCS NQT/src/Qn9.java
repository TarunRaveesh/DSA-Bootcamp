import java.util.Scanner;
public class Qn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, s, mi, sum, emi, sq;
        int y, n, k, yrs, l = 0;
        double[] bank = new double[5];
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();
        System.out.println("Enter tenature year");
        y = sc.nextInt();
        for (k = 0; k < 2; k++) {
            System.out.println("Enter the no of slabs");
            n = sc.nextInt();
            sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the period :");
                yrs = sc.nextInt();
                System.out.println("Enter the interest :");
                s = sc.nextDouble();
                mi = 0;
                sq = Math.pow((1+s), yrs*12);
                emi = (p*(s))/(1-1/sq);
                sum=sum+emi;
            }
            bank[l++] = sum;
        }
        if(bank[0] < bank[1])
            System.out.println("Bank A");
        else
            System.out.println("Bank B");
    }
}