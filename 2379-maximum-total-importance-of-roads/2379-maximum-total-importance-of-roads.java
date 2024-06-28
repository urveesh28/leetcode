class Solution {
    public long maximumImportance(int n, int[][] roads) {
        //1. store degree of each vertex
        //2. sort the degree array
        //3. assign values and sum
        
        long[] degree=new long[n];
        for(int[] i : roads){
            degree[i[0]]++;
            degree[i[1]]++;
        }

        Arrays.sort(degree);

        long ans=0;
        for(int i=0;i<degree.length;i++){
            ans+=degree[i]*(i+1);
        }

        return ans;
    }
}