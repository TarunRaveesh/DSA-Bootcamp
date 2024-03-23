import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        boolean ans = (n & (n - 1)) == 0;
        if (n == 0) ans = false;
        System.out.printf("Is %d a power of Two?? %B", n, ans);
    }
}
