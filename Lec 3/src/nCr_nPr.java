import java.util.Scanner;

public class nCr_nPr {
    public static int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input r: ");
        int r = in.nextInt();

        if (n >= r){
            double nPr = fact(n) / fact(n - r);
            double nCr = fact(n) / (fact(n - r) * fact(r));

            System.out.println("Permutation = " + nPr);
            System.out.println("Combination = " + nCr);
        } else {
            System.out.println("Error!!");
        }
    }
}
