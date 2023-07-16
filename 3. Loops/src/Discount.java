import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("MRP: ");
        double cost = in.nextInt();
        System.out.print("Discount Percentage: ");
        int discount = in.nextInt();

        double dc = cost * discount / 100;
        System.out.println("Discount Price = " + (cost - dc));
    }
}
