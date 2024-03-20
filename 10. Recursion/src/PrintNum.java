public class PrintNum {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // Base Condition
        if (n == 10) {
            System.out.print(10 + " ");
            return;
        }

        //Recursive Condition
        System.out.print(n + " ");
        print(n + 1); // Since this function is being called again and again, each time it will occupy separate space in the call stack.
    }
}
