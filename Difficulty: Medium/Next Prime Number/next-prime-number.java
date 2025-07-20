import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=n+1;i<=500;i++){
            boolean flag=true;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            
            if(flag){
                System.out.println(i);
                break;
            }
        }
        
    }
}