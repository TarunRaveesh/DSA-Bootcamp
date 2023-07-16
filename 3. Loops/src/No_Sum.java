import java.util.Scanner;
public class No_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] N = new int[100];
        int nsum = 0, pesum = 0, posum =0;

        for (int i = 0; i < 100; i++) {
            N[i] = in.nextInt();
            if (N[i] != 0) {
                if (N[i] < 0) {
                    nsum += N[i];
                } else if (N[i] > 0 && N[i] % 2 == 0) {
                    pesum += N[i];
                } else if (N[i] > 0 && N[i] % 2 != 0) {
                    posum += N[i];
                }
            } else {
                System.out.println("Exit");
                break;
            }
        }

        System.out.println("Negative Sum = " + nsum);
        System.out.println("Even Positive Sum = " + pesum);
        System.out.println("Odd Positive Sum = " + posum);
    }
}