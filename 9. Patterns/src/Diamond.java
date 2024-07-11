import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int n = sc.nextInt();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int k = n - i; k > 1; k--) {
                res.append(" ");
            }
            for (int j = 0; j <= i; j++) {
                res.append("* ");
            }
            res.append("\n");
        }

        System.out.println(res);
    }
}
