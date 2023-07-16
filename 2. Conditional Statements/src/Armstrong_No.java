import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Number = " + n);

        int dtemp = n, temp = n, m, digits = 0, sum = 0;

        while (dtemp > 0) {
            dtemp /= 10;
            digits++;
        }
        System.out.println("Digits = " + digits);

        while(temp > 0) {
            m = temp % 10;
            temp /= 10;
            sum += Math.pow(m, digits);
            System.out.println("Current Last Digit = " + m + ", Current Sum = " + sum);
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong No");
        } else {
            System.out.println(n + " is not an Armstrong No.");
        }
    }
}
