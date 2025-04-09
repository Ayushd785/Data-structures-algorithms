package Backtracking;

public class wordSearch1 {
    static int m;
    static int n;
    public static void main(String[] args) {
        char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        m = board.length;
        n = board[0].length;
        boolean ans = true;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(solve(i, j, word, board, 0)){
                   System.out.println(ans);
                   return;
                }

            }
            
        }
    }
    static boolean solve(int i, int j,String word,char [][] board, int k){
        if(k == word.length()){
            return true;
        }
        if(i<0 || i>m-1 || j<0 || j>n-1 || board[i][j] == '$' || board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '$';

        boolean isfound = (
            solve(i + 1, j, word, board, k + 1) ||
            solve(i - 1, j, word, board, k + 1) ||
            solve(i, j + 1, word, board, k + 1) ||
            solve(i, j - 1, word, board, k + 1)
        );

        board[i][j] = temp;
        
        return isfound;
        
    }
}
