import java.util.*;
public class Qn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        while(n > 0) {
            res = res*(n%10);
            n /= 10;
        }
        System.out.println(res);
        System.out.println('1' - '0');
    }
}