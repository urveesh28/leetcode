class Solution {
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        int max=0;
        Arrays.sort(nums);
        for(int i=n-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                max=Math.max(max,(nums[i]+nums[i-1]+nums[i-2]));
            }
        }
        return max;
    }
}