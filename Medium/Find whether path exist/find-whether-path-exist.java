//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    
    
    public static boolean helper(int[][] grid,int i,int j,int m,int n,boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==true || grid[i][j]==0){
            return false;
        }
        
        if(i==m && j==n){
            return true;
        }
        
        visited[i][j]=true;
        boolean flag=(helper(grid,i+1,j,m,n,visited) || helper(grid,i-1,j,m,n,visited) 
        || helper(grid,i,j+1,m,n,visited) || helper(grid,i,j-1,m,n,visited));
        
        visited[i][j]=false;
        
        return flag;
    }
    
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int[] src=new int[2];
        int[] dest=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    src[0]=i;src[1]=j;
                }
                if(grid[i][j]==2){
                    dest[0]=i;dest[1]=j;
                }
            }
        }
        
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        return helper(grid,src[0],src[1],dest[0],dest[1],visited);
    }
}