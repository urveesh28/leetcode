class Solution {
    
    public static boolean traverse(int[] nums,boolean flag){
        //flag denotes forward/backward traversing
        if(flag){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(traverse(nums,true) || (traverse(nums,false)))return true;
        return false;
    }
}