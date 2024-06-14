import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
       int maxsum = 0;

        for (int i = 0; i < n; i++) {
            int currsum = 0;
            int j = 0;
            while(maxsum <= 100) {
                currsum += prices[j];
                maxsum = Math.max(maxsum, currsum);
                j++;
            }
        }

        System.out.println(maxsum);
    }
}
