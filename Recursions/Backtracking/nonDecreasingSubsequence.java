package Backtracking;
import java.util.*;
public class nonDecreasingSubsequence {
    public static void main(String[] args) {
        int [] nums = {4,4,3,2,1};
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, temp, ans);
        System.out.println(ans);
    }
    static void solve(int i, int [] nums , List<Integer> temp, List<List<Integer>> ans){
        if(temp.size()>=2){
            ans.add(new ArrayList<>(temp));
        }
        HashSet<Integer> st = new HashSet<>();
        for(int j = i;j<nums.length;j++){
            if(st.contains(nums[j])) continue;
            if(!temp.isEmpty() && nums[j]<temp.get(temp.size()-1)) continue;
            st.add(nums[j]);
            temp.add(nums[j]);
            solve(j+1, nums, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}
