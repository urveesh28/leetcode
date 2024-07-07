//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minValue(String s, int k) {
        // code here
        int[] map=new int[26];
        for(char ch : s.toCharArray()){
            map[ch-'a']++;
        }
        
        Queue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        for(int i : map){
            pq.offer(i);
        }
        
        int ans=0;
        while(k>0){
            int v=pq.poll();
            v--;
            k--;
            pq.offer(v);
        }
        
        while(pq.size()>0){
            int a=pq.poll();
            ans+=(a*a);
        }
        
        return ans;
    }
}