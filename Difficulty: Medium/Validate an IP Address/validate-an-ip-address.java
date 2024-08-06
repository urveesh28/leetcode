//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] arr=str.split("\\.");
        //System.out.println(Arrays.toString(arr));
        if(arr.length<4 || arr.length>4)return false;
        
        for(String s : arr){
            if(s.length()>1 && s.charAt(0)=='0')return false;
            if(s.equals("") || Integer.parseInt(s)>255 
            || Integer.parseInt(s)<0)return false;        
        }
        
        return true;
        
    }
}