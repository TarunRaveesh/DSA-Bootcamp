import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Max = " + max(a, b, c));
        System.out.println("Min = " + min(a, b, c));
    }

    static int min(int a, int b, int c) {
        int min = 0;
        if (a < b && a < c) {
            min = a;
        }else if (b < c && b < a) {
            min = b;
        }else if (c < a && c < b) {
            min = c;
        }
        return min;
    }
    static int max(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        }else if (b > c && b > a) {
            max = b;
        }else if (c > a && c > b) {
            max = c;
        }
        return max;
    }
}
