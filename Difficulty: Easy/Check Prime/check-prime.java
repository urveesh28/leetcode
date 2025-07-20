import java.util.*;

public class Solution {
    
    
    static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(checkPrime(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}