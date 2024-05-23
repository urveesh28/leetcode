//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    
    public static void helper(int[][] m,int i,int j,int n,ArrayList<String> ans,String str,boolean[][] visited){
        if(i<0 || j<0 || i>=n || j>=n || m[i][j]==0 || visited[i][j]==true){
            return;
        }
        
        if(i==n-1 && j==n-1){
            ans.add(str);
            return;
        } 
        
        
        //System.out.println(str);
        
            visited[i][j]=true;
            helper(m,i-1,j,n,ans,str+'U',visited);
            helper(m,i+1,j,n,ans,str+'D',visited);
            helper(m,i,j-1,n,ans,str+'L',visited);
            helper(m,i,j+1,n,ans,str+'R',visited);
        
            visited[i][j]=false;
        
        
        return;
        
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        boolean[][] visited=new boolean[n][n]; 
        ArrayList<String> ans=new ArrayList<>();
        helper(m,0,0,n,ans,"",visited);
        return ans;
    }
}