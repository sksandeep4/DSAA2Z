import java.util.*;
public class ArmstrongNumber{

    public static int countDigits(int n){ 
        int count = (int)(Math.log10(n)+1);
        return count;
    }
    public static boolean isArmstrong(int n,int digits){
        int armstrong = 0;
        int original = n;
        while(n>0){
            int lastDigit = n%10;
            armstrong += Math.pow(lastDigit,digits);
            n/=10;
        }
        if(armstrong == original)
        return true;
        return false;
    }
    public static void main(String[] args){
        int N = 153;
        System.out.println("N: " + N);
        if(isArmstrong(N, countDigits(N))){
            System.out.println(N + " is an Armstrong Number!");
        }
        else
            System.out.println(N + " is NOT an Armstrong Number!");
    }
}