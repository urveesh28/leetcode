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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
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
    
    private boolean helper(char[][] b,int i,int j,int k,String word,boolean[][] visited){
        if(k==word.length()){
            return true;
        }
        
        if(i<0||j<0||i>=b.length||j>=b[0].length||visited[i][j]==true||b[i][j]!=word.charAt(k)){
            return false;
        }
        
        visited[i][j]=true;
        
        boolean flag=helper(b,i-1,j,k+1,word,visited)||helper(b,i+1,j,k+1,word,visited)||
        helper(b,i,j-1,k+1,word,visited)||helper(b,i,j+1,k+1,word,visited);
        
        visited[i][j]=false;
        
        return flag;
    }
    
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        boolean[][] visited=new boolean[board.length][board[0].length];
        boolean ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    ans=helper(board,i,j,0,word,visited);
                    if(ans)return true;
                }
            }
        }
        return false;
    }
}