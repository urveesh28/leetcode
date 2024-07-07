class Solution {
    public int minOperations(int[] nums) {
        //simple flip 3 values and increase count
        //if resultant all 1's return count
        //else return -1

        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                //flip
                count++;
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1-nums[i+2];
            }
        }

        //last check 
        for(int i : nums){
            if(i==0)return -1;
        }

        return count;
    }
}