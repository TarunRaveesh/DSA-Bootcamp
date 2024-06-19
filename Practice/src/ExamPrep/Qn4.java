package ExamPrep;

import java.util.*;

public class Qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            set.add(arr[i][0] + ":" + arr[i][1]);
        }

        System.out.println(findSquareCoordinates(arr, set));
    }

    public static int findSquareCoordinates(int[][] arr, HashSet<String> set) {
        int n = arr.length;
        int reqPoints = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = arr[i][0];
                int y1 = arr[i][1];
                int x2 = arr[j][0];
                int y2 = arr[j][1];

                int dx = Math.abs(x2 - x1);
                int dy = Math.abs(y2 - y1);

                // Possible Square1 (x1, y1) (x2, y2) (x1 - dy, y1 + dx) (x2 - dy, y2 + dx)
                int add1 = 0;
                if(!set.contains((x1 - dy) + ":" + (y1 + dx))) add1++;
                if(!set.contains((x2 - dy) + ":" + (y2 + dx))) add1++;
                reqPoints = Math.min(reqPoints, add1);

                // Possible Square2 (x1, y1) (x2, y2) (x1 + dy, y1 - dx) (x2 + dy, y2 - dx)
                int add2 = 0;
                if(!set.contains((x1 + dy) + ":" + (y1 - dx))) add2++;
                if(!set.contains((x2 + dy) + ":" + (y2 - dx))) add2++;
                reqPoints = Math.min(reqPoints, add2);
            }
        }
        return reqPoints == Integer.MAX_VALUE ? 0 : reqPoints;
    }
}
