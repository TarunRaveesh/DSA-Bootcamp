package BasicRound;

public class Q112 { // Index of substring
    public static void main(String[] args) {
        String A = "test123string";
        String B = "123";

        System.out.println(IdxOf(A, B));
    }

    private static int IdxOf(String A, String B) {
        int n = A.length();
        int m = B.length();

        for (int i = 0; i < n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if(A.charAt(i + j) != B.charAt(j)) {
                    break;
                }
            }
            if(j == m) return i;
        }
        return -1;
    }
}
