public class palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int val = ispalindrome(n, 0);
        if(val == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    static int ispalindrome(int n,int value){
        if(n==0){   
            return value;
        }
        value = value*10 + n%10;
        return ispalindrome(n/10, value);
    }
}
