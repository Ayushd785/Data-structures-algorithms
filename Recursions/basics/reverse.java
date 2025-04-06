package basics;
public class reverse {
    public static void main(String[] args) {
        int value = 0;
        System.out.println(reverse(12345678, value));
    }
    static int reverse(int n,int value){
        if(n==0){
            return value;
        }
        value = value*10 + n%10;
        return reverse(n/10, value);
    }
    
}
