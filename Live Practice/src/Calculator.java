import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Operator: ");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter two numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                switch (ch) {
                    case '+' -> System.out.println("Add = " + (n1 + n2));
                    case '-' -> System.out.println("Sub = " + (n1 - n2));
                    case '*' -> System.out.println("Mul = " + (n1 * n2));
                    case '/' -> System.out.println("Div = " + (n1 / n2));
                    case '%' -> System.out.println("Mod = " + (n1 % n2));

                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid operation. Try again.");

            }
        }
    }
}
