package Questions;

public class UnequalPairs {
    public static void main(String[] args) {
        String str1 = "asdfghij";
        String str2 = "adsfgijh";

        printUnequalAdjacentPairs(str1, str2);
    }

    public static void printUnequalAdjacentPairs(String str1, String str2) {
        int length = str1.length();

        for (int i = 0; i < length - 1; i++) {
            String pair1 = str1.substring(i, i + 2);
            String pair2 = str2.substring(i, i + 2);

            if (!pair1.equals(pair2)) {
                System.out.println(pair1 + "-" + pair2);
            }
        }
    }
}
