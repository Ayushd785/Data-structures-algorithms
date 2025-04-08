package subsequences;
import java.util.*;

public class subset2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        Arrays.sort(arr);  // 🔧 Required for duplicate skipping
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, arr, temp, ans);
        System.out.println(ans);
    }

    static void solve(int i, int[] arr, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp)); 

        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1]) continue; // Skip duplicates

            temp.add(arr[j]);
            solve(j + 1, arr, temp, ans);
            temp.remove(temp.size() - 1); // Backtrack
        }
    }
}
