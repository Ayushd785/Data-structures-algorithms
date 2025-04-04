import java.util.*;
public class oneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
    static void print(int n){
        if(n ==0){
            return;
        }
        print(n-1);
        System.out.println(n);
        
    }
}
