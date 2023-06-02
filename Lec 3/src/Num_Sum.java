import java.util.Scanner;

public class Num_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Sum = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                Sum += n;
            }
        }
        System.out.println("Sum = " + Sum);
    }
}
