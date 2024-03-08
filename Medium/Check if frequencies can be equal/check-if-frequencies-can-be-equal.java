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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Integer,Integer> hashMap=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            min=Math.min(m.getValue(),min);
            max=Math.max(m.getValue(),max);
            hashMap.put(m.getValue(),hashMap.getOrDefault(m.getValue(),0)+1);
        }
        if(hashMap.size()>2)
        return false;
        if(max>min && hashMap.get(max)>1 && min==1)
        return true;
        if(max>min && hashMap.get(max)>1 && min>1)
        return false;
        if(min==max || max==min+1)
        return true;
        return false;
    }
}