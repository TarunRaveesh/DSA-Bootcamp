import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + "! = " + factorial(n));

    }

    static int factorial(int n) {
        int p = 1;
        while (n > 0) {
            p *= n;
            n--;
        }
        return p;
    }
}
