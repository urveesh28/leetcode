class Solution {
    public boolean increasingTriplet(int[] nums) {
        //simple approach O(N) - TC
        
        int nums1=Integer.MAX_VALUE;
        int nums2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int nums3=nums[i];
            if(nums3<=nums1){
                nums1=nums[i];
            }
            else if(nums3<=nums2){
                nums2=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}