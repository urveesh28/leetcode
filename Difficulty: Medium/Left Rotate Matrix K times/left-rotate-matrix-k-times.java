//{ Driver Code Starts
// Initial Template for java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int k = Integer.parseInt(S[2]);
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Integer.parseInt(S1[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(k, mat);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function template for java

class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        k=k%mat[0].length;
        int[][] ans=new int[mat.length][mat[0].length];
        //first k cols ko last me
        
        int c=mat[0].length-1;
        for(int i=k-1;i>=0;i--){
            for(int j=0;j<mat.length;j++){
                ans[j][c]=mat[j][i];
            }
            c--;
        }
        
        //baki same rhega
        for(int i=0;i<mat[0].length-k;i++){
            for(int j=0;j<mat.length;j++){
                ans[j][i]=mat[j][i+k];
            }
        }
        
        return ans;
    }
}