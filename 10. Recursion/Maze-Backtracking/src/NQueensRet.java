import java.util.*;
public class NQueensRet {

    static List<List<String>> list = new ArrayList<>();

    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
        System.out.println(list);
    }

    static void queens(boolean[][] board, int row) {
        if (row == board.length) {
            List<String> result = new ArrayList<>();
            for (boolean[] arr : board) {
                StringBuilder sb = new StringBuilder();
                for (boolean element : arr) {
                    sb.append(element ? "Q" : ".");
                }
                result.add(sb.toString());
            }
            list.add(result);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }
        return true;
    }
}
