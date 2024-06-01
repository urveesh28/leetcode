class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix=new int[arr.length];
        int[] ans=new int[queries.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]^arr[i];
        }

        //simple just xor the values

        int k=0;
        for(int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
            int prev=u-1;
            if(prev<0){
                ans[k]=prefix[v];
            }
            else{
                ans[k]=prefix[v]^prefix[prev];
            }
            k++;
        }
        return ans;
    }
}