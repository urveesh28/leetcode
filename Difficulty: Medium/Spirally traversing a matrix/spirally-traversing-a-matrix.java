//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        
        while(up<=down && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[up][i]);
            }
            
            up++;
            
            for(int i=up;i<=down;i++){
                ans.add(matrix[i][right]);
            }
            
            right--;
            
            if(up<=down){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[down][i]);     
                }
                down--;
            }
            
            if(left<=right){
                for(int i=down;i>=up;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        
        return ans;
    }
}
