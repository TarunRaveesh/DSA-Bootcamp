import java.util.Scanner;

public class Tarun_Goes_Out {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Month: ");
        String month = in.next();
        int days = 0, count = 0;
        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> days = 31;
            case "April", "June", "September", "November" -> days = 30;
            case "February" -> days = 28;
            default -> System.out.println("Invalid Month");
        }
        System.out.println("Days: " + days);
        for (int i = 0; i < days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Tarun can go out " + count + " times in August.");
    }
}