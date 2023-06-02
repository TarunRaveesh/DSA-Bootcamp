import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m = 0, Sum = 0;
        while (true) {
            double n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                m += 1;
                Sum += n;
            }
        }
        System.out.println("Average = " + Sum/m);
    }
}
