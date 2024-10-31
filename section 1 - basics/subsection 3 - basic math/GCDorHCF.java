import java.util.*;
public class GCDorHCF{
    
    public static int HCF(int n1, int n2){ //Brute Force Method
        int hcf = 1;
        int leading = n1>n2?n1:n2;
        System.out.println("Larger number is: " + leading);
        for(int i=2;i<(leading/2);i++){
            if(n1%i==0 && n2%i==0){
                hcf = i;
                System.out.println("HCF was changed to " + i);
            }
        }
        return hcf;
    }

    public static int HCFOptimal(int n1, int n2){ //Brute Force Method

        while(n1 > 0 && n2 >0){
            if(n1 > n2){
                n1 = n1 % n2;
            }
            else{
                n2 = n2 % n1;
}        }
        if(n1==0)
        return n2;
        return n1;
    }
    public static void main(String[] args){
        int n1 = 15;
        int n2 = 20;
        System.out.println("N1: " + n1);
                System.out.println("N2: " + n2);
        int hcf = HCFOptimal(n1, n2);
        System.out.println("HCF: " + hcf);
    }
}