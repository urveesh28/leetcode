//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        int a=1,b=1,c=1;
        if(n<3)return 1;
        
        int s=0;
        for(int i=3;i<=n;i++){
            s=(a+b)%(1000000007);
            a=b;
            b=c;
            c=s;
        }
        
        return s;
    }
    
}
