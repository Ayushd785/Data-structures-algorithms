package subsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsum2 {
    public static void main(String[] args) {
        int [] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        solve(0, arr, target, temp, ans);
        System.out.println(ans);

    }
    static void solve(int i, int[]arr, int target, List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j =i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]) continue;
            if(arr[j]>target){
                break;
            }
            temp.add(arr[j]);
            solve(j+1, arr, target-arr[j], temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}
