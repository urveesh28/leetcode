//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        long a=0,b=1;
        if(n==0)return (int)a;
        if(n==1)return (int)b;
        else{
            long sum=0;
            for(int i=1;i<=n-1;i++){
                sum=(a+b)%1000000007;
                a=b;
                b=sum;
            }
        }
        return (int)(b);
    }
}