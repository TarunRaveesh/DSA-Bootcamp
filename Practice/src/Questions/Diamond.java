package Questions;
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            str.append(" ".repeat(Math.max(0, n - i)));
            str.append("* ".repeat(Math.max(0, i)));
            str.append("\n");
        }

        for (int i = n - 1; i > 0; i--) {
            str.append(" ".repeat(Math.max(0, n - i)));
            str.append("* ".repeat(i));
            str.append("\n");
        }
        System.out.println(str);
    }
}
