package subsequences;
import java.util.*;
public class combinationsum3 {
    public static void main(String[] args) {
        int k = 3;
        int n = 9;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, n, k, temp, ans);
        System.out.println(ans);
    }
    static void solve(int i, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        if(n == 0){
            if(temp.size()==k){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int j = i;j<9;j++){
            if(j>n) break;
            temp.add(j);
            solve(j+1, n-j, k, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}
