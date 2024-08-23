class Solution {
    /* memoization
    private static int helper(int[] cost,int i){
        if(i>=cost.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int l=cost[i]+helper(cost,i+1);
        int r=cost[i]+helper(cost,i+2);

        dp[i]=Math.min(l,r);
        return dp[i];
    }
    */
    
    //tabulation
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        
        //initial conditions
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }

        return Math.min(dp[n-1],dp[n-2]);
    }
}