//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                list1.add(mat1[i][j]);
                list2.add(mat2[i][j]);
            }
        }
        
        int p1=0;
        int p2=list2.size()-1;
        int count=0;
        while(p1<list1.size() && p2>=0){
            while(p1<list1.size() && p2>=0 && list1.get(p1) + list2.get(p2) > x)p2--;
            while(p1<list1.size() && p2>=0 && list1.get(p1) + list2.get(p2) < x)p1++;
            if(p1<list1.size() && p2>=0 && list1.get(p1) + list2.get(p2) == x){
                count++;
                p1++;p2--;
            }
        }
        return count;
    }
}