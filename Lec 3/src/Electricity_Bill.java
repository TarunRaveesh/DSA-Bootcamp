import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Units Consumed: ");
        double units = in.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = (units * 4.22) + (units * 0.15);
        } else if (units > 100 && units <= 200) {
            bill = ((100 * 4.22) + ((units -100) * 5.02) + (units * 0.15));
        } else if (units > 200) {
            bill = ((100 * 4.22) + (100 * 5.02) + ((units - 200) * 5.87) + (units * 0.15));
        } else {
            System.out.println("Insert Electric Units");
        }
        System.out.println("Electricity Bill = Rs." + bill);
    }
}
