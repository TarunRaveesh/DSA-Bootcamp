import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//      String r = new StringBuilder(s).reverse().toString();
        char[] S = s.toCharArray();
        char[] R = new char[S.length];
        for (int i = 0; i < S.length; i++) {
            R[i] = S[S.length - 1 - i];
        }
        String r = new String(R);
        System.out.println("Original = " + s);
        System.out.println("Reversed = " + r);
        if (s.equals(r)) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }

    }
}
