package Backtracking;

import java.util.Arrays;

public class uniquepath2 {
    static int m;
    static int n;
    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        m = grid.length;
        n = grid[0].length;
        if(grid[0][0]==1){
            System.out.println(0);
            return;
        }
        int [][] dp = new int [m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(solve(0, 0, grid,dp));

    }
    static int solve(int i , int j, int [][] grid,int [][] dp){
        int path = 0;
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        // move right 
        if(j<n-1 && grid[i][j+1]!=1){
            path+= solve(i, j+1, grid,dp);
        }
        // move left 
        if(i<m-1 && grid[i+1][j]!=1){
            path+= solve(i+1, j, grid,dp);
        }
        return dp[i][j] =path;
    }
}
