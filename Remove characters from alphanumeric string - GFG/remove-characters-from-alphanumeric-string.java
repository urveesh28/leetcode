//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeCharacters(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static char[] map = {'0','1','2','3','4','5','6','7','8','9'};
    
    public static String maker(String s,String newstr,int i){
        if(i==s.length()){
            return newstr;
        }
        int val=s.charAt(i)-'0';
        if(val<=9 && val>=0){
            newstr+=map[val];
        }
        return maker(s,newstr,++i);
    }
    
    String removeCharacters(String S) {
        // code here
        //using recursion
        return maker(S,"",0);
    }
}