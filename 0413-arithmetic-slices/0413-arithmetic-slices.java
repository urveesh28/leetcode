class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)return 0;
        int c=0;
        int a=0;
        
        for(int i=0;i<nums.length-2;i++){
            if((nums[i+1]-nums[i])==(nums[i+2]-nums[i+1])){
                a++;
                c+=a;
            }
            else a=0;
            
        }
        
        return c;
    }
}