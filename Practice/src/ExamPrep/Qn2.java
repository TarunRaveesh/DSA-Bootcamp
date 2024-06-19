package ExamPrep;

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxsum = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if(maxsum - sum > prices[j]) {
                    sum += prices[j];
                    ans = Math.max(ans, j - i + 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
