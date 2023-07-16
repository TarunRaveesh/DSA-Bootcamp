import java.util.Scanner;

public class Perfect_No {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                Sum += i;
            }
        }
        if(Sum == n) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }
    }
}