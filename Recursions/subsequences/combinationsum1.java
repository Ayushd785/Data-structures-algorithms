package subsequences;
import java.util.*;

public class combinationsum1 {
    public static void main(String[] args) {
        int [] arr = {2,3,5,7};
        int target = 7;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, target, temp, ans, arr);
        System.out.println(ans);
    }
    static void solve(int i, int target, List<Integer> temp, List<List<Integer>> ans, int[] arr){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i>=arr.length|| target<0){
            return;
        }
        // take and stay
        temp.add(arr[i]);
        solve(i, target-arr[i], temp, ans, arr);
        // not take and move to next 
        temp.remove(temp.size()-1);
        solve(i+1, target, temp, ans, arr);
    }
}
