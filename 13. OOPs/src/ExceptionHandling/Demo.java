package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        divide(24, 2);
        divide(4, 0);

    }

    static void divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        }
        System.out.println(a/b);
    }
}
