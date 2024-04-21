import java.util.Scanner;

public class ToggleBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(toggle(a));
    }

    static int toggle(int n) {
        int x = 0;
        int digits = (int)(Math.log(n) / Math.log(2)) + 1;
        for (int i = 0; i < digits; i++) {
            x = (x << 1) + 1;
        }
        System.out.println(x);
        return (n ^ x);
    }
}