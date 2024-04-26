package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            divide(15, 5);
            divide(6, 0);
        } catch (ArithmeticException e) { // Stricter Rules must come above
            System.out.println(e.getMessage());
        } catch (Exception e) { // We can use multiple catch blocks
            System.out.println("Normal Exception");
        }  finally {
            System.out.println("This will always Execute.");
        }

        try { // Can also use multiple try-catch blocks in the same method
            // Mimicking an exception
            // throw new Exception("Just for fun"); // Custom Exception
            String name = "Tarun";
            if(name.equals("Tarun")) {
                throw new MyException("The given name is " + name);
            }
        } catch (MyException e) { // User defined exception.
            System.out.println(e.getMessage());
        }
    }

    static void divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        }
        System.out.println(a/b);
    }
}
