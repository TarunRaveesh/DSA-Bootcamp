import java.util.Scanner;

public class Qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strlen = sc.nextInt();
        String a = sc.next();
        String b = sc.next();


    }

    static int algo(String a, String b, int n) {
        if(a.length() != b.length()) {
            return -1;
        }
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        int[] charA = new int[26];
        int[] charB = new int[26];

        for (char ch : A) {
            charA[ch - 'a'] = 1;
        }
        for (char ch : B) {
            charA[ch - 'a'] = 1;
        }

        for (int i = 0; i < 26; i++) {
            if(charA[i] != charB[i]) {
                return -1;
            }
        }

        int ops = 0;
        for (int i = 0; i < n; i++) {

        }
        return ops;
    }
}
