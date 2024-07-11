package BasicRound;

public class Q113 { // X Pattern
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = s.length();
        char[] arr = s.toCharArray();

        // Upper part of the pattern
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(arr[i]);
                } else if (j == n - i - 1) {
                    System.out.print(arr[n - i - 1]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the Pattern
        for (int i = n/2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(arr[i]);
                } else if (j == n - i - 1) {
                    System.out.print(arr[n - i - 1]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
