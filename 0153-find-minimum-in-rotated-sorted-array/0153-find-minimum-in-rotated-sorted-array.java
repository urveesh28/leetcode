class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            min=Math.min(min,nums[h]);
            min=Math.min(min,nums[l]);
            l++;
            h--;
        }
        return min;
    }
}