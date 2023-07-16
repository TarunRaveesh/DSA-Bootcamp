import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("P = ");
        double P = in.nextDouble();
        System.out.print("R = ");
        double R = in.nextDouble();
        System.out.print("T = ");
        double T = in.nextDouble();

        System.out.println("S.I = " + ((P * R * T)/ 100));
    }
}
