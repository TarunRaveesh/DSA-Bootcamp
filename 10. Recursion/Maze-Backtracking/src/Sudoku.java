class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if (solve(board)) {
            System.out.println("Sudoku solved successfully:");
            display(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean solve(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if(board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if(isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if(solve(board)) { // Recursively call function while isSafe is true
                                return true;
                            }
                            board[row][col] = 0; // Backtrack before getting out of isSafe
                        }
                    }
                    return false; // Sudoku Not Solved
                }
            }
        }
        return true; // Sudoku Solved
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        // Col
        for (int i = 0; i < board[row].length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        // Each 3x3 Box
        int sqrt = (int) Math.sqrt(board.length);
        int r = row - (row % sqrt);
        int c = col - (col % sqrt);
        for (int i = r; i < r + sqrt; i++) {
            for (int j = c; j < c + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}