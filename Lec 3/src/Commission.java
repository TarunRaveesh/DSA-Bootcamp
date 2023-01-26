import java.util.Scanner;

public class Commission {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Principal Amount: ");
        double x = in.nextDouble();
        System.out.print("Input Commission Amount: ");
        double y = in.nextDouble();

        double z = x / y;
        System.out.println("Commission Percentage = " + z + " %.");
    }
}
