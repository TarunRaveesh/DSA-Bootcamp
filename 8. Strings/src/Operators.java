import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 2); //String + int = acts like wrapper Integer class and returns .toString()
                                    //Similar to "a" + "2"

        System.out.println("Tarun" + new ArrayList<>());
        System.out.println("Tarun" + new Integer(56));

        String ans = new Integer(56) + " " + new ArrayList<>(); // Won't work if atleast one String
                                                                        // object isn't there in the expression
        System.out.println(ans);
    }
}
