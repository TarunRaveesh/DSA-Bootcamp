import java.util.Scanner;

public class Str_Rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input String: ");
        String s = in.nextLine();
        char[] original = s.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - i - 1];
        }
        String r = new String(reverse);
        System.out.println("Reversed String: " + r);
    }
}
