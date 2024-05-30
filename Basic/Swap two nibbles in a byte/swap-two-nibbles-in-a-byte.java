//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        String a="";
        String b="";
        for(int i=0;i<8;i++){
            int bit=(n & 1);
            if(i<4){
                a=Integer.toString(bit)+a;
            }
            else{
                b=Integer.toString(bit)+b;
            }
            n=n>>1;
        }
        
        a=a+b;
        
        int ans=0;
        for(int i=7;i>=0;i--){
            ans+=(a.charAt(i)-'0')*Math.pow(2,8-i-1);
        }
        
        return ans;
    }
}