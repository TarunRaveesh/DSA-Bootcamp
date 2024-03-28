public class PrintNum {
    public static void main(String[] args) {
        print(10);
        System.out.println();
        revPrint(10);
    }

    static void print(int n) {
        // Base Condition
        if (n == 0) {
            return;
        }

        //Recursive Condition
        System.out.print(n + " ");
        print(n - 1); // Since this function is being called again and again, each time it will
                        // occupy separate space in the call stack.
    }

    static void revPrint(int n) {
        // Base Condition
        if (n == 0) {
            return;
        }
        //Recursive Condition
        revPrint(n - 1);
        System.out.print(n + " ");
    }
}
