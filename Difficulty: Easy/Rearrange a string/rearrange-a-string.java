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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            String ans="";
            boolean isNum=false;
            int sum=0;
            for(char ch : s.toCharArray()){
                if(ch<='9' && ch>='0'){
                    if(ch!='0'){
                        isNum=true;
                    }
                    sum+=(ch-'0');
                }
                
                if(ch<='Z' && ch>='A'){
                    ans+=ch;
                }
            }
            
            
            char[] arr=ans.toCharArray();
            Arrays.sort(arr);
            ans="";
            ans=new String(arr);
            
            if(isNum){
            ans+=Integer.toString(sum);
            }
            
            return ans;
            
        }
}
