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
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
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
    
    private static void helper(int[][] mat,int i,int j,String path,ArrayList<String> ans,
    boolean[][] visited){
        
        if(i<0 || i>=mat.length || j<0 || j>=mat.length || visited[i][j]==true
        || mat[i][j]==0){
            return;
        }
        
        
        if(i==mat.length-1 && j==mat.length-1){
            ans.add(path);
            return;
        }
        
        
        visited[i][j]=true;
        
        helper(mat,i+1,j,path+'D',ans,visited);
        helper(mat,i-1,j,path+'U',ans,visited);
        helper(mat,i,j+1,path+'R',ans,visited);
        helper(mat,i,j-1,path+'L',ans,visited);
        
        visited[i][j]=false;
        
    }
    
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        boolean[][] visited=new boolean[mat.length][mat[0].length];
        helper(mat,0,0,"",ans,visited);
        return ans;
    }
}