import java.util.*;
public class CountDigits{
    public static int countDigits(int n){ //Brute Force Method
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int countDigitsOptimal(int n){ //Optimal Method
        int count = (int)(Math.log10(n)+1);
        return count;
    }
    public static void main(String[] args){
        int N = 20141;
        System.out.println("N: " + N);
        int digits = countDigitsOptimal(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}