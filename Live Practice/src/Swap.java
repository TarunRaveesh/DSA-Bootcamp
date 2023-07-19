public class Swap {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x, y);
//      int temp = a;
//      a = b;
//      b = temp;
        System.out.println("Swap: " + x + " " + y);
    }

    static void swap(int a, int b) { /* i.e. here a and b are completely new objects formed in the
                                       heap memory and do not reference to x and y */
        int temp = a;                                         // ^
        a = b;                                                // |
        b = temp;                                             // |
        /* Will not work cz the function calls the value and not the reference (i.e. memory)
        of the reference variable and hence the function creates new objects without copying
        the value in this case. */
    }
}