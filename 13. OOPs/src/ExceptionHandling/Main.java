package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            divide(15, 5);
            divide(6,0);
            // Mimicking an exception
            // throw new Exception("Just for fun"); // Custom Exception
        } catch (ArithmeticException e) { // Stricter Rules must come above
            System.out.println(e.getMessage());
        } catch (Exception e) { // We can use multiple catch blocks
            System.out.println("Normal Exception");
        }  finally {
            System.out.println("This will always Execute.");
        }
    }

    static void divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        }
        System.out.println(a/b);
    }
}
