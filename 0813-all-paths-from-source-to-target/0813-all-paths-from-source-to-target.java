class Solution {
    
    public static void dfs(int s,int e,int[][] graph,List<Integer> l,List<List<Integer>> ans,boolean[] visited){
        if(s==e){
            l.add(s);
            ans.add(new ArrayList<>(l));
            l.remove(l.size()-1);
            return;
        }

        //set
        visited[s]=true;
        l.add(s);

        for(int i=0;i<graph[s].length;i++){
            dfs(graph[s][i],e,graph,l,ans,visited);
        }

        l.remove(l.size()-1);
        
        //reset
        visited[s]=false;
    }
    
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int s=0;
        int e=graph.length-1;
        boolean[] visited=new boolean[graph.length];

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        dfs(s,e,graph,l,ans,visited);
        return ans;
    }
}