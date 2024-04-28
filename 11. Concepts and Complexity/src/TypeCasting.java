import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n = input.nextFloat();
        System.out.println(n);

//      For Auto Casting OR Type Conversion to happen:
//        1. Both types should be compatible. (e.g. int & float)
//        2. Destination type > Source Type.  ( float > int BUT int !> float)
//        3. Hence, we use Type Casting

//      *** Type Casting *** OR Narrow Conversion
        int num = (int)(34.45f);
        System.out.println(num);

        String s = "200";
        //Converting String into int using Integer.parseInt()
        int i = Integer.parseInt(s);
        //Printing value of i
        System.out.println(i);

        int a = 258;
        byte b = (byte)(a);  // 258 % 256 = 2
        System.out.println(b);

//      Automatic type promotion in expressions
        byte x = 40;
        byte y = 20;
        byte z = 10;
        int c = x * y / z;
        System.out.println(c); // converts to int

//      Also refer notes.
    }
}
