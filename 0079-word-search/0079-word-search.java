class Solution {
    public static boolean helper(char[][] b,int i,int j,String w,int k,int[][] visited){
        if(k==w.length())return true;
        if(i<0 || i>=b.length || j<0 || j>=b[0].length || visited[i][j]==1 || w.charAt(k)!=b[i][j]){
            return false;
        }
        
        visited[i][j]=1;
        boolean f=(helper(b,i,j+1,w,k+1,visited)||helper(b,i,j-1,w,k+1,visited)||helper(b,i+1,j,w,k+1,visited)||helper(b,i-1,j,w,k+1,visited));
        visited[i][j]=0;
        return f;
    }
    
    
    public boolean exist(char[][] board, String word) {
        int[][] visited=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean v=helper(board,i,j,word,0,visited);
                    if(v)return v;
                }
            }
        }
        return false;
    }
}