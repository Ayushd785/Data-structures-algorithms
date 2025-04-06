package subsequences;
import java.util.*;

public class combinationsum1 {
    public static void main(String[] args) {
        int [] arr = {2,3,5,7};
        int target = 7;
        List<Integer> temp = new ArrayList<>();
        HashSet<List<Integer>>st = new HashSet<>();
        solve(0,0,arr,temp,st,target);
        System.out.println(st);
    }
    static void solve(int i, int sum, int [] arr, List<Integer> temp,HashSet<List<Integer>>st,int target){
        if(sum==target){
            st.add(new ArrayList<>(temp));
            return;
        }
        if(i>=arr.length || sum>target){
            return;
        }
        // take
        temp.add(arr[i]);
        solve(i+1, sum+arr[i], arr, temp, st, target);
        // not take
        temp.remove(temp.size()-1);
        solve(i+1, sum, arr, temp, st, target);
    }
}
