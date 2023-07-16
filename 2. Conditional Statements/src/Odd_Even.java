import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is EVEN");
        } else {
            System.out.println(n + " is ODD");
        }
    }
}