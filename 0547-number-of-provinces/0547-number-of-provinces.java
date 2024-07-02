class Solution {
    
    private static void dfs(List<List<Integer>> adj,boolean[] visit,int src){
        visit[src]=true;

        for(int i=0;i<adj.get(src).size();i++){
            int v=adj.get(src).get(i);
            if(!visit[v]){
                dfs(adj,visit,v);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        //simple dfs and count
        //creating the adjacency list
        //then dfs call and increase the counter
        int count=0;
        List<List<Integer>> adj=new ArrayList<>();
        int V=isConnected.length;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(i!=j && isConnected[i][j]>0){
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visit=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visit[i]){
                dfs(adj,visit,i);
                count++;
            }
        }

        return count;
    }
}