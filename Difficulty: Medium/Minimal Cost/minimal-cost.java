//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    
    /*
    recursive
    private static int helper(int[] arr,int k,int i){
        if(i==0)return 0;
        
        int min=Integer.MAX_VALUE;
        int val=0;
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                val=helper(arr,k,i-j)+Math.abs(arr[i]-arr[i-j]);
            }
            min=Math.min(min,val);
        }
        
        return min;
        
    }
    
    */
    
    //memoized
    
    private static int helper(int[] arr,int k,int i,int[] dp){
        if(i==0)return 0;
        if(dp[i]!=-1)return dp[i];
        
        int min=Integer.MAX_VALUE;
        int val=0;
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                val=Math.abs(arr[i]-arr[i-j])+helper(arr,k,i-j,dp);
            }
            min=Math.min(min,val);
        }
        return dp[i]=min;
    }
    
    public int minimizeCost(int arr[], int k) {
        // code here
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        //System.out.println(Arrays.toString(dp));
        return helper(arr,k,arr.length-1,dp);
        
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(arr, k);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends