import java.util.Scanner;

public class
Batting_Avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Runs: ");
        int r = in.nextInt();
        System.out.print("Matches: ");
        int m = in.nextInt();
        System.out.print("Not Out: ");
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("NA");
        } else {
            int d = (m - n);
            System.out.println("Dismissals = " + d);
            System.out.println("Batting Avg = " + (r / d));
        }
    }
}
