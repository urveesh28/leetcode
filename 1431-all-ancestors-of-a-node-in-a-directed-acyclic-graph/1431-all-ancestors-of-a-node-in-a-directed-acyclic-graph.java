class Solution {

    //dfs 
    private void dfs(List<List<Integer>> adj,int par,int curr,List<List<Integer>> ans,boolean[] visited){
        visited[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            int val=adj.get(curr).get(i);
            if(visited[val]==false){
                ans.get(val).add(par);
                dfs(adj,par,val,ans,visited);
            }
        }
    }
    
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        //adjacency list
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }

        //initialization
        for(int[] i : edges){
            adj.get(i[0]).add(i[1]);
        }

        //dfs call
        for(int i=0;i<n;i++){
            dfs(adj,i,i,ans,new boolean[n]);
        }

        //sort
        for(int i=0;i<ans.size();i++){
            Collections.sort(ans.get(i),(a,b)->(a-b));
        }
        
        return ans;
        
    }
}