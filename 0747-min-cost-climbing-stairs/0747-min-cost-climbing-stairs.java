class Solution {
    
    static int[] dp;
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

    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);

        return Math.min(helper(cost,0),helper(cost,1));
    }
}