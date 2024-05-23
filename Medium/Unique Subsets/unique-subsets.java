//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    ArrayList <ArrayList<Integer>> res = new solve().AllSubsets(arr,n);
		    for (int i = 0; i < res.size (); i++)
		    {
		        System.out.print ("(");
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		            if (j != res.get(i).size()-1)
		                System.out.print ((res.get(i)).get(j) + " ");
		            else
		                System.out.print ((res.get(i)).get(j));
		        }
		        System.out.print (")");
		      
		    }
		    System.out.println();
		}
	}
}
// } Driver Code Ends



class Comp implements Comparator<ArrayList<Integer>>{
    @Override
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
            
            int n=Math.min(a.size(),b.size());
            
            for(int i=0;i<n;i++){
                if(a.get(i)!=b.get(i)){
                    return a.get(i)-b.get(i);
                }
            }
            
            return a.size()-b.size();
            
        }
}


class solve
{
    //Function to find all possible unique subsets.
    
    
    public static void helper(int[] arr,int i,int n,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> ans,Set<ArrayList<Integer>> set){
        if(i==n){
            //l.add(arr[i]);
            if(set.contains(l)==false){
                ans.add(new ArrayList<>(l));
                set.add(l);
                  
            }
            return; 
        }
        l.add(arr[i]);
        helper(arr,i+1,n,l,ans,set);
        l.remove(l.size()-1);
        helper(arr,i+1,n,l,ans,set);
    }
    
    
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        Set<ArrayList<Integer>> set=new HashSet<>();
        helper(arr,0,n,l,ans,set);
        Collections.sort(ans,new Comp());
        return ans;
    }
}
