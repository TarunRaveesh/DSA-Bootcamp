import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abccbba";
        System.out.println(isPalindrome1(str));
        System.out.println(isPalindrome2(str));
    }

    static boolean isPalindrome1(String str) {
        // Method 1 - String Builder
        str = str.toLowerCase();
        String rev = new StringBuilder(str).reverse().toString(); // Less optimal, creates more objects and consumes more space
        return str.equals(rev);
    }

    static boolean isPalindrome2(String str) {
        // Method 2 - Two Pointer
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            char e = str.charAt(str.length() - i - 1);
            if (s != e) return false;
        }
        return true;
    }
}
