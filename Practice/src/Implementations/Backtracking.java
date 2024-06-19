package Implementations;

import java.util.*;

public class Backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean[][] board = new boolean[n][n];
        int[][] path = new int[n][n];

        backtrack("", board, 0, 0, path, 1);
    }

    static void backtrack(String str, boolean[][] maze, int row, int col, int[][] path, int step) {
        // Base Case
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(str);
            System.out.println();
            return;
        }

        // Recursive Case
        if (maze[row][col]) {
            return;
        }

        maze[row][col] = true;
        path[row][col] = step;

        // Up Down Left Right Traversal
        if (row > 0) { // Up
            backtrack(str + "U", maze, row - 1, col, path, step + 1);
        }
        
        if (row < maze.length - 1) { // Down
            backtrack(str + "D", maze, row + 1, col, path, step + 1);
        }
        
        if (col > 0) { // Left
            backtrack(str + "L", maze, row, col - 1, path, step + 1);
        }
        
        if (col < maze[0].length - 1) { // Right
            backtrack(str + "R", maze, row, col + 1, path, step + 1);
        }

        // Backtrack
        maze[row][col] = false;
        path[row][col] = 0;
    }
}