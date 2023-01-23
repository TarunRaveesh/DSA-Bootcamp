import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Currency in INR: ");
        double c = in.nextDouble();
        System.out.println("USD Value = $" + (c * 0.012));
    }
}
