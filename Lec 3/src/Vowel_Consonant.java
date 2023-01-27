import java.util.Scanner;
public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char[] x = a.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'a' || x[i] == 'A' || x[i] == 'e' || x[i] == 'E' || x[i] == 'i' || x[i] == 'I' || x[i] == 'o' || x[i] == 'O') {
                System.out.print("Vowel ");
            } else {
                System.out.print("Consonant ");
            }
        }
    }
}
