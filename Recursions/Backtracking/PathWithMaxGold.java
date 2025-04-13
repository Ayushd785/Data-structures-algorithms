package Backtracking;

public class PathWithMaxGold {
    public static void main(String[] args) {
        int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==0) continue;
                ans = Math.max(ans,solve(i,j,m,n,grid));
            }
        }
        System.out.println(ans);
    }
    static int solve(int i, int j, int m, int n, int [][] grid){
        int ans = 0;
        int currgold = grid[i][j];
        grid[i][j] = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for(int k = 0;k<m;k++){
            int ni = i + dx[k];
            int nj = j + dy[k];
            if(ni>=0 && nj>=0 && ni<m && nj<n && grid[ni][nj]!=0){
                ans = Math.max(ans, solve(ni, nj, m, n, grid));
            }
        }
        grid[i][j] = currgold;
        return ans + currgold;
    }
}
