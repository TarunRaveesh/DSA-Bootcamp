import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = in.nextDouble();
        System.out.print("Rate (of Interest): ");
        double r = in.nextInt();
        System.out.print("Time (in Years): ");
        double t = in.nextInt();

        double ci = (p * Math.pow((1 - r / 100), t));
        System.out.println("C.I = " + ci);
    }
}
