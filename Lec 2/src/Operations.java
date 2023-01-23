import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Insert Operation: ");
        char op = in.next().trim().charAt(0);

        if(op == '+') {
            System.out.println("Add = " + (a + b));
        } else if(op == '-') {
            System.out.println("Sub = " + (a - b));
        } else if(op == '*') {
            System.out.println("Mul = " + (a * b));
        } else if (op == '/') {
            System.out.println("Div = " + (a / b));
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
