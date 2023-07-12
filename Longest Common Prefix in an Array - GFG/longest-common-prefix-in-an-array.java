//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String minstring="";
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(minlen>arr[i].length()){
                minlen=arr[i].length();
                minstring=arr[i];
            }
        }
        
        String minvalue="";
        boolean flag=false;
        for(int i=0;i<minstring.length();i++){
            boolean status=false;
            for(int j=0;j<n;j++){
                if(minstring.charAt(i)!=arr[j].charAt(i)){
                    status=false;
                    break;
                }
                status = true;
                
            }
            if(status){
                minvalue+=minstring.charAt(i);
                flag=true;
            }
        }
        if(!(flag))return "-1";
        return minvalue;
    }
}