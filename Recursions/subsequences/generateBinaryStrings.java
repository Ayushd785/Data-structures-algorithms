package subsequences;
import java.util.*;
public class generateBinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        solve(n, sb, ans);
        System.out.println(ans);
    }
    static void solve(int n, StringBuilder sb, List<String> ans){
        if(sb.length()>=n){
            ans.add(sb.toString());
            return;
        }
        sb.append('0');
        solve(n, sb, ans);
        sb.deleteCharAt(sb.length()-1);
        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '1') {
            sb.append('1');
            solve(n, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}
