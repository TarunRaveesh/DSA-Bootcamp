import java.util.Scanner;

public class Sum_until_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true) {
            String s = in.next();
            if (s.equals("x")) {
                break;
            }
            int n = Integer.parseInt(s);
            sum += n;
        }
        System.out.println(sum);
    }
}
