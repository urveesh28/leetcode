//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxproduct1=Long.MIN_VALUE;
        long maxproduct2=Long.MIN_VALUE;
        long product=1;
        for(int i=0,j=0;j<n;){
            product=product*arr[j];
            maxproduct1=Math.max(maxproduct1,product);
            if(arr[j]==0){
                i=j;
                product=1;
            }
            j++;
        }
        product=1;
        for(int i=n-1,j=n-1;j>=0;){
            product=product*arr[j];
            maxproduct2=Math.max(maxproduct2,product);
            if(arr[j]==0){
                i=j;
                product=1;
            }
            j--;
        }
        return Math.max(maxproduct1,maxproduct2);
    }
}