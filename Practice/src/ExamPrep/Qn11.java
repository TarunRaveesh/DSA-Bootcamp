package ExamPrep;

import java.util.Scanner;

public class Qn11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int R = sc.nextInt();

        int[] rocks = new int[S];
        for (int i = 0; i < S; i++) {
            rocks[i] = sc.nextInt();
        }

        int[][] Ranges = new int[R][2];
        for (int i = 0; i < R; i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();

            Ranges[i][0] = min;
            Ranges[i][1] = max;
        }

        for (int[] range : Ranges) {
            System.out.println(reqRocksInRange(range[0], range[1], rocks));
        }

    }

    static int reqRocksInRange(int a, int b, int[] rocks) {
        int count = 0;
        for (int rock : rocks) {
            if (rock >= a && rock <= b) {
                count++;
            }
        }
        return count;
    }
}
