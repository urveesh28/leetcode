//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
        // Code here
        int rmin=arr.length;
        int cmin=arr.length;
        
        //row-wise traverse
        for(int i=0;i<arr.length;i++){
            int l=0;
            int h=arr.length-1;
            
            while(l<h){
                if(arr[i][l]!=arr[i][h]){
                    break;
                }
                l++;
                h--;
            }
            
            if(l>=h){
                rmin=Math.min(rmin,i);
            }
        }
        
        //col-wise traverse
        for(int i=0;i<arr.length;i++){
            int l=0;
            int h=arr.length-1;
            while(l<h){
                if(arr[l][i]!=arr[h][i]){
                    break;
                }
                l++;
                h--;
            }
            
            if(l>=h){
                cmin=Math.min(cmin,i);
            }
        }
        
        //System.out.println(cmin+" "+rmin);
        
        if(rmin<arr.length)return Integer.toString(rmin)+" R";
        if(cmin<arr.length)return Integer.toString(cmin)+" C";
        return "-1";
        
        
    }
}
