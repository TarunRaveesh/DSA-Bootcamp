public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true}, {true, true, true}, {true, true, true}};
        pathAllDirections(board, "", 0, 0);
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

        if(r > 0) { // UP
            pathAllDirections(maze, p + "U", r - 1, c);
        }
        if(r < maze.length - 1) { // DOWN
            pathAllDirections(maze, p + "D",r + 1, c);
        }
        if(c > 0) { // LEFT
            pathAllDirections(maze, p + "L", r, c - 1);
        }
        if(c < maze[0].length - 1) { //RIGHT
            pathAllDirections(maze, p + "R", r, c + 1);
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
}
