class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=-1;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            max=(max > nums[l]+nums[h])?max:(nums[l] + nums[h]);
            l++;
            h--;
        }
        return max;
    }
}