import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true}, {true, true, true}, {true, true, true}};
        pathAllDirections(board, "", 0, 0);
        System.out.println();
        System.out.println();
        int[][] path = new int[board.length][board[0].length];
        printAllPaths(board, "", 0, 0, path, 1);
    }

    private static void pathAllDirections(boolean[][] maze, String p, int r, int c) {
        // Considering all directions U, D, L, R while traversing the array
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p + " ");
            return;
        }

        if(!maze[r][c]) {
            return;
        }
        //I have to block this cell since it will be traversed in this call:
        maze[r][c] = false;

        if(r < maze.length - 1) { // DOWN
            pathAllDirections(maze, p + "D",r + 1, c);
        }
        if(c < maze[0].length - 1) { //RIGHT
            pathAllDirections(maze, p + "R", r, c + 1);
        }
        if(r > 0) { // UP
            pathAllDirections(maze, p + "U", r - 1, c);
        }
        if(c > 0) { // LEFT
            pathAllDirections(maze, p + "L", r, c - 1);
        }

        // Traversing in all directions will result in infinite recursions as we might get back to the cell we have
        // already visited, hence mark the mas false to tackle this problem. BUT, when u do that, the maze will be
        // altered for the upcoming recursions calls, so now to fix this, again while returning the current function
        // call, change the cell values to true as if the maze was not altered. Now this last step of fixing the changes
        // made while the recursion to make the future calls work as usual is called BACKTRACKING.

        // The function will be over at this line
        // So before the function is removed from the stack, also remove the changes made by that function
        maze[r][c] = true;
    }

    private static void printAllPaths(boolean[][] maze, String p, int r, int c, int[][] path, int step) {
        // Considering all directions U, D, L, R while traversing the array
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }



        if(!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1) { // DOWN
            printAllPaths(maze, p + "D",r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1) { //RIGHT
            printAllPaths(maze, p + "R", r, c + 1, path, step + 1);
        }
        if(r > 0) { // UP
            printAllPaths(maze, p + "U", r - 1, c, path, step + 1);
        }
        if(c > 0) { // LEFT
            printAllPaths(maze, p + "L", r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
