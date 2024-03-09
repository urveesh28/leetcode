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
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        String prev=s;
        String ans="";
        for(int j=0;j<r;j++){
            ans="";
            for(int i=0;i<=n;i++){
                if(prev.charAt(i)=='1'){
                    ans+="10";
                }
                else ans+="01";
            }
            prev=ans;
        }
        //System.out.println(ans);
        return ans.charAt(n);
    }
}