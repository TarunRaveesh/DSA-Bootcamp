public class NQueens {
    public static void main(String[] args) {
        int row = 5, col = 5;
        boolean[][] board = new boolean[row][col];
        System.out.println(queens(board, 0));
    }
    // Complexity:
    // The TIME complexity of the N-Queens problem using recursion and backtracking is O(N!), where N is the number
    // of queens (and the size of the board). This is because there are N possibilities for placing the first queen,
    // N-2 for the second queen (since it cannot be placed in the same row or diagonal as the first queen), N-4 for
    // the third queen, and so on. This results in a total of N! possible arrangements.

    // The SPACE complexity of the algorithm is O(N^2), where N is the number of queens. This is because the algorithm
    // uses a 2D boolean array to represent the board, which has a size of N*N. Additionally, the recursion stack can
    // go as deep as N, as each recursive call represents placing one queen on the board.

    static int queens(boolean[][] board, int row) { // Row Number is equal to no of Queens being placed
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // Placing the queen and checking for every row and col
        for (int col = 0; col < board[0].length; col++) {
            // Place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row+1);
            }
            board[row][col] = false; // Backtrack
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check from current queen and above (Since, we are yet to call the recursion calls for the below queens
        // now need to check for them, as this check will happen for the below queen in the same manner).
        // Vertical Row
        for (int i = 0; i < row; i++) {
            if(board[i][col]) return false;
        }
        // Left Diagonal
        int maxLeft = Math.min(row, col); // Min bcz the diagonal might not extend to the walls of row or col
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]) return false;
        }
        // Right Diagonal
        int maxRight = Math.min(row, board[0].length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]) return false;
        }
        return true;
    }

    static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if(element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
