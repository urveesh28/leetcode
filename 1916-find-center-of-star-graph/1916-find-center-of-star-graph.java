class Solution {
    public int findCenter(int[][] edges) {
        int[] ans=new int[edges.length+2];
        for(int[] i : edges){
            ans[i[0]]++;
            ans[i[1]]++;
        }

        
        for(int i=1;i<ans.length;i++){
            if(ans[i]==edges.length){
                return i;
            }
        }

        return 0;
    }
}