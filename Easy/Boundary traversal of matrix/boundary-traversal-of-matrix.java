//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        /*int rowstart=0,colstart=0,rowend=n-1,colend=m-1;
        for(int i=colstart;i<=colend;i++){
            list.add(matrix[rowstart][i]);
        }
        if(rowstart<=rowend)rowstart++;
        for(int i=rowstart;i<=rowend;i++){
            list.add(matrix[i][colend]);
        }
        if(colstart<=colend)colend--;
        for(int i=colend;i>=colstart;i--){
            list.add(matrix[rowend][i]);
        }
        if(rowstart<=rowend)rowend--;
        for(int i=rowend;i>=rowstart;i--){
            list.add(matrix[i][colstart]);
        }
        return list;*/
        if(n==1){
            for(int i=0;i<m;i++){
                list.add(matrix[0][i]);
            }
        }
        else if(m==1){
            for(int i=0;i<n;i++){
                list.add(matrix[i][0]);
            }
        }
        
        else{
            int rowstart=0,colstart=0,rowend=n-1,colend=m-1;
            for(int i=colstart;i<=colend;i++){
                list.add(matrix[rowstart][i]);
            }
            
            rowstart++;
            
            for(int i=rowstart;i<=rowend;i++){
                list.add(matrix[i][colend]);
            }
            
            colend--;
            
            for(int i=colend;i>=colstart;i--){
                list.add(matrix[rowend][i]);
            }
            
            rowend--;
        
            for(int i=rowend;i>=rowstart;i--){
                list.add(matrix[i][colstart]);
            }
        }
        return list;
        
    }
}
