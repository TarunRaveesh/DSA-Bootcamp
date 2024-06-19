package ExamPrep;

import java.util.Scanner;

public class Qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[n];
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            board[i] = sc.nextInt();
            students[i] = i + 1;
        }
        System.out.println(countDrumBeats(board, students));
    }

    static int countDrumBeats(int[] B, int[] stud) {
        int beats = 0;
        int n = B.length;
        do {
            beats++;
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = stud[B[i] - 1];
            }
            stud = temp;
        } while (!isSorted(stud));
        return beats;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(!(arr[i] > arr[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
