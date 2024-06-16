import java.util.Scanner;

public class Qn16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j+=2) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);;
    }
}
