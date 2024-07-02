//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    private static void dfs(List<List<Integer>> graph,boolean[] visit,int src){
        visit[src]=true;
        
        for(int i=0;i<graph.get(src).size();i++){
            int v=graph.get(src).get(i);
            if(!visit[v]){
                dfs(graph,visit,v);
            }
        }
    }
    
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                if(i!=j && adj.get(i).get(j)>0){
                    graph.get(i).add(j);
                }
        }
        }
        
        //System.out.println(graph);
        boolean[] visit=new boolean[V];
        int ans=0;
        for(int i=0;i<V;i++){
            if(!visit[i]){
                dfs(graph,visit,i);
                ans++;
            }
        }
        return ans;
    
}
}
