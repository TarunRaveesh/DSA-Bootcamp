import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 10 == x) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
