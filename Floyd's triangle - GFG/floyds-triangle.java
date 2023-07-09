//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            ob.printFloydTriangle(N);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printFloydTriangle(int N){
        // code here
        int sum=0;
        for(int i=1;i<=N;i++){
            
            for(int j=1;j<=i;j++){
                sum+=1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}