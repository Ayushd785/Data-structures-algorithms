package AdvancedBacktracking;
import java.util.*;
public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        solve(0, ans, board, n);
        for(List<String> solution : ans){
            for(String row : solution){
                System.out.println(row + " ");
            }
            System.out.println(); // separate solutions
        }
    }
    static void solve(int col, List<List<String>> ans , char [][] board,int n){
        if(col>=n){
            List<String> temp = new ArrayList<>();
            for(int i = 0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<n;i++){
             if(isvalid(i,col,board,n)){
                board[i][col] = 'Q';
                solve(col+1, ans, board, n);
                board[i][col] = '.';
            }
        }
    }
    static Boolean isvalid(int row, int col, char [][] board,int n){
        int duprow = row;
        int dupcol = col;
        // upper diagonal
        while(duprow>=0 && dupcol>=0){
            if(board[duprow][dupcol]=='Q') return false;
            dupcol--;
            duprow--;
        }
        // right
        duprow = row;
        dupcol = col;
        while(dupcol>=0){
            if(board[duprow][dupcol]=='Q') return false;
            dupcol--;
        }
        duprow = row;
        dupcol = col;

        while (dupcol>=0 && duprow<n) {
            if(board[duprow][dupcol]=='Q') return false;
            dupcol--;
            duprow++;
        }
        return true;
    }
}
