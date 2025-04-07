package subsequences;
import java.util.*;
public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        solve(0, 0, n, sb, ans);
        System.out.println(ans);

    }
    static void solve(int countl,int countr,int n, StringBuilder sb ,List<String> ans){
        if(countl+countr>=2*n){
            ans.add(sb.toString());
            return;
        }
        // check for left
        if(countl<n){
            sb.append('(');
            solve(countl+1, countr, n, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(countr<n && countl>countr){
            sb.append(')');
            solve(countl, countr+1, n, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
