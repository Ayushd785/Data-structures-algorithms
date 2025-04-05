package subsequences;
import java.util.*;
public class printSubseqWithSumK {
    public static void main(String[] args) {
        int [] arr = {3,2,1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, 0, 5, arr, temp, ans);
        System.out.println(ans);

        
    }
    static void solve(int i, int sum, int k, int [] arr, List<Integer> temp, List<List<Integer>> ans){
        if(sum ==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i>=arr.length || sum>k){
            return;
        }
        // take
        temp.add(arr[i]);
        solve(i+1,sum+arr[i],k,arr,temp,ans);
        // not take
        temp.remove(temp.size()-1);
        solve(i+1,sum,k,arr,temp,ans);
    }

}
