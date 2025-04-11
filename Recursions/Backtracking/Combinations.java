package Backtracking;
import java.util.*;
public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(1,n,k,temp,ans);
        System.out.println(ans);
    }
    static void solve(int i, int n, int k , List<Integer> temp , List<List<Integer>> ans){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j = i;j<=n;j++){
            temp.add(j);
            solve(j+1,n,k,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
