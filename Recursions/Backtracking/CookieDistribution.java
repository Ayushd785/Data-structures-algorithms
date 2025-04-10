package Backtracking;
import java.util.*;
public class CookieDistribution {
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int [] cookies = {8,15,10,20,8};
        int k = 2;
        int [] ans = new int [k];
        solve(0, ans, cookies, k);
        System.out.println(result);

    }
    static void solve(int i, int [] ans , int [] cookies, int k){
        if(i>=cookies.length){
            int max =0;
            for(int a:ans){
                if(a>max){
                    max = a;
                }
            }
            result = Math.min(result, max);
            return;
        }
        for(int t = 0;t<k;t++){
            ans[t]+=cookies[i];
            solve(i+1, ans, cookies, k);
            ans[t]-=cookies[i];
        }
    }
}
