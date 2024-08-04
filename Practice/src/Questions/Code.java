import java.util.*;
import java.lang.Math;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Code {

    public static int getMaxBeautySum(int N, List<List<Integer>> A) {
        int[][] maxInRow = new int[N][N];
        int[][] minInRow = new int[N][N];
        int[][] maxInCol = new int[N][N];
        int[][] minInCol = new int[N][N];

        for (int i = 0; i < N; i++) {
            int rowMax = Integer.MIN_VALUE;
            int rowMin = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                rowMax = Math.max(rowMax, A.get(i).get(j));
                rowMin = Math.min(rowMin, A.get(i).get(j));
                maxInRow[i][j] = rowMax;
                minInRow[i][j] = rowMin;
            }
        }

        for (int j = 0; j < N; j++) {
            int colMax = Integer.MIN_VALUE;
            int colMin = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                colMax = Math.max(colMax, A.get(i).get(j));
                colMin = Math.min(colMin, A.get(i).get(j));
                maxInCol[i][j] = colMax;
                minInCol[i][j] = colMin;
            }
        }
        int maxBeautySum = 0;

        for (int size1 = 1; size1 <= N; size1++) {
            for (int i1 = 0; i1 <= N - size1; i1++) {
                for (int j1 = 0; j1 <= N - size1; j1++) {
                    int max1 = Integer.MIN_VALUE;
                    int min1 = Integer.MAX_VALUE;
                    for (int i = i1; i < i1 + size1; i++) {
                        for (int j = j1; j < j1 + size1; j++) {
                            max1 = Math.max(max1, A.get(i).get(j));
                            min1 = Math.min(min1, A.get(i).get(j));
                        }
                    }
                    int beauty1 = max1 - min1;

                    for (int size2 = 1; size2 <= N; size2++) {
                        for (int i2 = 0; i2 <= N - size2; i2++) {
                            if (i2 < i1 + size1 && i2 + size2 > i1) continue;
                            for (int j2 = 0; j2 <= N - size2; j2++) {
                                if (j2 < j1 + size1 && j2 + size2 > j1) continue;

                                int max2 = Integer.MIN_VALUE;
                                int min2 = Integer.MAX_VALUE;
                                for (int i = i2; i < i2 + size2; i++) {
                                    for (int j = j2; j < j2 + size2; j++) {
                                        max2 = Math.max(max2, A.get(i).get(j));
                                        min2 = Math.min(min2, A.get(i).get(j));
                                    }
                                }
                                int beauty2 = max2 - min2;

                                maxBeautySum = Math.max(maxBeautySum, beauty1 + beauty2);
                            }
                        }
                    }
                }
            }
        }

        return maxBeautySum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());
        List<List<Integer>> A = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            A.add(
                    Arrays.asList(scan.nextLine().trim().split(" "))
                            .stream().map(s -> Integer.parseInt(s)).collect(toList())
            );
        }

        int result = getMaxBeautySum(N, A);
        System.out.println(result);
    }
}
