//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        Long ans = (long)0;
        int pos = 0;
        while (x != 0) {
            if (x % 2 == 1) {
                ans += (long)(Math.pow(2, (31-pos)));
            }
            x /= 2;
            pos++;
        }
        return ans;
    }
}