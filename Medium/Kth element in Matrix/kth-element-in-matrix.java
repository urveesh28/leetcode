//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Checker implements Comparator<Integer>{
    @Override
    public int compare(Integer a,Integer b){
        if(a>b)return 1;
        else if(a<b)return -1;
        return 0;
    }
}

class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        Queue<Integer> pq=new PriorityQueue<>(new Checker());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(mat[i][j]);
            }
        }
        
        int ans=0;
        for(int i=0;i<k;i++){
            ans=pq.remove();
        }
        
        return ans;
    }
}