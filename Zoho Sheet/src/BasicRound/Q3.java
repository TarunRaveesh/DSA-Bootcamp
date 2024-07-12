package BasicRound;

public class Q3 {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            int temp = num + i;
            for (int k = i; k >= 0; k--) {
                System.out.print(temp-- + " ");
                num++;
            }
            System.out.println();
        }
        num--;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
