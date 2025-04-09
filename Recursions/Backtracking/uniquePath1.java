package Backtracking;
import java.util.*;
public class uniquePath1 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int [][] dp = new int [m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(solve(0, 0, m, n,dp));
        
    }
    static int solve(int i, int j, int m ,int n,int [][] dp){
        int paths = 0;
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        // move right
        if(j<n-1){
            paths += solve(i, j+1, m, n,dp);
        }
        // move down
        if(i<m-1){
            paths += solve(i+1, j, m, n,dp);
        }
        return dp[i][j] = paths;
    }
}
