class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] dp=new int[n];
        
        Arrays.fill(dp,1);
        for(int i=0;i<k;i++){
            for(int j=1;j<n;j++){
                dp[j]=dp[j]+dp[j-1];
                dp[j]=(int)dp[j]%(int)(1e9+7);
            }
        }

        return dp[n-1];

    }
}