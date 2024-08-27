package Questions;
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                str.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                str.append("* ");
            }
            str.append("\n");
        }

        for (int i = n - 1; i > 0; i--) {
            for (int k = 1; k <= n - i; k++) {
                str.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                str.append("* ");
            }
            str.append("\n");
        }

        System.out.println(str);
    }
}
