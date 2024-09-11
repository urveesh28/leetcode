//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            long[] a = new long[input.length];

            for (int i = 0; i < input.length; i++) {
                a[i] = Long.parseLong(input[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.minCost(a));
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        PriorityQueue<Long> res=new PriorityQueue<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            res.add(arr[i]);
        }
        long cost=0;
        while(res.size()>1){
            long A1=res.poll();
            long A2=res.poll();
            long ans=A1+A2;
            cost +=ans;
            res.add(ans);
        }
        return cost;
    }
}