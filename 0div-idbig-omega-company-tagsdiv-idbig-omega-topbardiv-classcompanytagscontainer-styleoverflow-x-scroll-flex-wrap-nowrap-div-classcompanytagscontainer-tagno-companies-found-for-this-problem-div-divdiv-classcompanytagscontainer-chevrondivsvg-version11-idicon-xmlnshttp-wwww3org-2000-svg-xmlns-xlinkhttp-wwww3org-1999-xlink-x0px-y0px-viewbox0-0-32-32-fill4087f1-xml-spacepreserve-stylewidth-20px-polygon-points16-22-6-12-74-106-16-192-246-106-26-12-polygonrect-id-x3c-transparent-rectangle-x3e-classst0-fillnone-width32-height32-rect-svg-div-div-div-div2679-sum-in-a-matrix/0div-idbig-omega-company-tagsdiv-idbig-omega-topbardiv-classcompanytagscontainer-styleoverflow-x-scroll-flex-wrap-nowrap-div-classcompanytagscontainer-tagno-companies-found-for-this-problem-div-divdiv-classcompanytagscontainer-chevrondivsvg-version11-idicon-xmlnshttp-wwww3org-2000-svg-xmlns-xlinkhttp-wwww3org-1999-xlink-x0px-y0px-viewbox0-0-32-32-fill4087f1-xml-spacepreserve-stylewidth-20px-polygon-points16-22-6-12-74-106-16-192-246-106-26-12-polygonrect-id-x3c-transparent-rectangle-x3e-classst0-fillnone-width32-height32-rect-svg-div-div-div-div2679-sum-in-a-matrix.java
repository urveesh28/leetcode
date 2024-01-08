class Solution {
    public int matrixSum(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        int sum=0;
        for(int l=0;l<n;l++){
            int maxele=-1;
            for(int i=0;i<m;i++){
                int a=0,b=0;
                int maxval=-1;
                for(int j=0;j<n;j++){
                    if(maxval<nums[i][j]){
                        maxval=nums[i][j];
                        a=i;
                        b=j;
                    }
                }
                nums[a][b]=-1;
                maxele=(maxele>maxval)?maxele:maxval;
            }
            sum+=maxele;
        }
        return sum;
    }
}