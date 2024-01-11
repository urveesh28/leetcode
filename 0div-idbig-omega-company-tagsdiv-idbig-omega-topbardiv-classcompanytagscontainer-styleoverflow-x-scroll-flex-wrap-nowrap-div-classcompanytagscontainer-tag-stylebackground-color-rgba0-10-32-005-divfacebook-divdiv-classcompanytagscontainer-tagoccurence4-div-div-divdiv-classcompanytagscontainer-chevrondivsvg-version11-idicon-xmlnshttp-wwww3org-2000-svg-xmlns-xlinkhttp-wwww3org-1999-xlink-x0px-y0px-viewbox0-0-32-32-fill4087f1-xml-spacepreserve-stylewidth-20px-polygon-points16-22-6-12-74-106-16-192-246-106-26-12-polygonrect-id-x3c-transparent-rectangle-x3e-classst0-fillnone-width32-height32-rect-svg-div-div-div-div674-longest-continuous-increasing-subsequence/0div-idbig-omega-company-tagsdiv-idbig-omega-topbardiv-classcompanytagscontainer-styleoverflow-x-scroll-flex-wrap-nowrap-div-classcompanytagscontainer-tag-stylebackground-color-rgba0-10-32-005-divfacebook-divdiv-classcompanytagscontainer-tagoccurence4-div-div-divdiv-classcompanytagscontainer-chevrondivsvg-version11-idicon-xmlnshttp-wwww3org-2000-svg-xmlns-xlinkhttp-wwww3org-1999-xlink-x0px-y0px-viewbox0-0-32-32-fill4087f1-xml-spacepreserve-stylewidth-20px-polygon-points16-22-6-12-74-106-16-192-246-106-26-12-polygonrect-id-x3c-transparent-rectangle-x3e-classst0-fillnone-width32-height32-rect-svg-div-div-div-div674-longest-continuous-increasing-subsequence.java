class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i=0;
        int j=1;
        int max=1;
        int dist=1;
        while(j<nums.length){
            if(nums[j]>nums[j-1]){
                dist=j-i+1;
            }
            else{
                i=j;
            }
            max=(max>=dist)?max:dist;
            j++;
        }
        return max;
    }
}