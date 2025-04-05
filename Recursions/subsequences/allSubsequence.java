package subsequences;
import java.util.*;
public class allSubsequence {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int [] arr = {3,2,1};
        solve(0,arr,ans);
    }
    static void solve(int i, int [] arr,List<Integer> ans){
        if(i>=arr.length){
            System.out.println(ans);
            return;
        }
        // take 
        ans.add(arr[i]);
        solve(i+1, arr, ans);
        // not take
        ans.remove(ans.size()-1);
        solve(i+1, arr, ans);
        
    }
}
