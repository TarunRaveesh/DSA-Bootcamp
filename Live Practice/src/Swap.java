public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("Swap: " + a + " " + b); /* Will not work cz the function calls the value and not the reference (i.e. memory)
                                                       of the reference variable and hence the function creates new objects without
                                                       copying the value in this case.
                                                    */
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}