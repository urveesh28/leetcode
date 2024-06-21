//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String[] arr=sentence.split(" ");
        long ans=-1;
        for(String str : arr){
            if(str.charAt(0)<='9' && str.charAt(0)>='0'){
                //check for 9
                boolean flag=true;
                for(char ch : str.toCharArray()){
                    if(ch=='9'){
                        flag=false;
                        break;
                    }
                }
                
                if(flag){
                    ans=Math.max(ans,Long.parseLong(str));
                }
                
            }
        }
        return ans;
    }
}