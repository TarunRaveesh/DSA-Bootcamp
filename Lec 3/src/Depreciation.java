import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Simple Depreciation
        System.out.print("Actual Cost: ");
        double actual = in.nextDouble();
        System.out.print("Residual Cost: ");
        double residual = in.nextDouble();
        System.out.print("Useful Life: ");
        double life = in.nextDouble();

        double depreciation = actual - residual / life;
        System.out.println("Depreciation = " + depreciation); */


        double V1 = in.nextDouble(); // Actual Value
        double r = in.nextDouble(); // Deprecant
        double t = in.nextDouble();

        double V2 = V1 * Math.pow((1 - (r /100)), t);
        System.out.println("Deprecated Value = " + V2);

    }
}
