import java.util.*;
public class Palindrome{
    
    public static int reverseDigits(int n){ //Optimal Method
        int reverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverse = (reverse*10)+lastDigit;
            n/=10;
        }
        return reverse;
    }
    public static void main(String[] args){
        int N = 313;
        System.out.println("N: " + N);
        int reverse = reverseDigits(N);
        if(N == reverse)
        System.out.println(N + " is a Palindrome");
        else
                System.out.println(N + " is not a Palindrome");
    }
}