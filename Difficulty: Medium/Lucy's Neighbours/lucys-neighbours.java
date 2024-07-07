//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
import java.lang.*;

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
	public ArrayList<Integer> Kclosest(int arr[], int n, int x, int k) 
	{ 
	    // Your code goes here 
	    Queue<int[]> pq=new PriorityQueue<>((a,b) -> {
	        if(a[0]!=b[0]){
	            return b[0]-a[0];
	        }
	        else return b[1]-a[1];
	    });
	    
	    for(int i=0;i<n;i++){
	        int d=Math.abs(x-arr[i]);
	        pq.offer(new int[]{d,arr[i]});
	        if(pq.size()>k)pq.poll();
	    }
	    
	    ArrayList<Integer> ans=new ArrayList<>();
	        
	    while(k>0){
	        k--;
	        ans.add(pq.poll()[1]);
	    }
	    
	    Collections.sort(ans);
	    return ans;
	}
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int x = sc.nextInt();
        	int k = sc.nextInt();
        	int arr[] = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		arr[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.Kclosest(arr,n,x,k);

            for (int i=0; i<ans.size(); i++) 
        	    System.out.print(ans.get(i)+" "); 
            System.out.println();
            t--;
        }
    } 
} 




// } Driver Code Ends