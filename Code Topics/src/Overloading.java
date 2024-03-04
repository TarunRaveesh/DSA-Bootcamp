public class Overloading {
    public static void main(String[] args) {
        fun(5);
        fun("Tarun");
    }

    static void fun(int a) {
        System.out.println("First One: ");
        System.out.println(a);
    }
    static void fun(String b) {
        System.out.println("Second One: ");
        System.out.println(b);
    }

    /* To carry out fn over loading:
       1. Either No of arguments should be different.
       2. Or the data type of the formal parameters must be different.
    */
}
