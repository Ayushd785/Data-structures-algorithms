import java.util.Scanner;

public class nToOne {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    static void print(int n){
        if(n ==0){
            return;
        }
        
        System.out.println(n);
        print(n-1);
        
    }
}
