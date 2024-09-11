class Solution {
    private static int helper(int[] nums){
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
    
    public int rob(int[] nums) {
        //First :  0th index to n-2th index
        //Second : 1th index to n-1th index
        //return Max(First,Second)
        
        if(nums.length==1)return nums[0];
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        
        int[] First=new int[nums.length-1];
        int[] Second=new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            First[i]=nums[i];
            Second[i]=nums[i+1];
        }
        return Math.max(helper(First),helper(Second));
    }
}