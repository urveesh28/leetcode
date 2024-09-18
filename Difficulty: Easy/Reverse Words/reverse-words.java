//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] arr=str.split("\\.");
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans=arr[i]+ans;
            if(i<arr.length-1){
                ans="."+ans;
            }
        }
        
        return ans;
    }
}