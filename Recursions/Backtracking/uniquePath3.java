package Backtracking;
import java.util.*;
public class uniquePath3 {
    static int m;
    static int n;
    public static void main(String[] args) {
        int [][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        m = grid.length;
        n = grid[0].length;
        // 0 rep space
        // 1 rep starting square 
        // 2 represents finish line 
        // -1 rep obstacle 
        int ans = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1){
                     ans = solve(i, j, grid);
                }
            }
        }
        System.out.println(ans);
    }
    static int solve(int i, int j,int [][] grid){
        int path = 0;
        if(i>m-1 || j>n-1 || i<0 || j<0 || grid[i][j]==-1 || grid[i][j]==9){
            return 0;
        }
        
        if(grid[i][j] == 2){
            if(allvis(grid)){
                return 1;
            }
            else{
                return 0;
            }
        }
        // mark 
        int temp = grid[i][j];
        grid[i][j] = 9;
        // move in all four dir
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for(int dir =0 ;dir<4;dir++){
            int i_new = i + dx[dir];
            int j_new = j + dy[dir];
            path += solve(i_new, j_new, grid);

        }
        grid[i][j] = temp;
        return path;

    }
    static boolean allvis(int[][]grid){
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
}
