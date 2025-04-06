package basics;
public class products {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(prod(n));
    }
    static int prod(int n){
        if(n==0){
            return 1;
        }
        return n%10*prod(n/10);
    }
}
