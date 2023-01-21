package src;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Sum_until_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true) {
            char x = in.next().trim().charAt(0);
            if (x != 'x') {
                int temp = x;
                sum += x;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
