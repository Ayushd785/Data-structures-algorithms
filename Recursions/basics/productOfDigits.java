package basics;
public class productOfDigits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(prod(n));
    }
    static int prod(int n){
        if(n<=1){
            return 1;
        }
        return n * prod(n-1);
    }
}
