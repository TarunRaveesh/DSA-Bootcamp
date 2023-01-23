import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not Leap Year");
        }
    }
}
