class Solution {
    public int removeElement(int[] nums, int val) {
        int pos=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[pos]=nums[i];
                pos++;
            }
        }
        return pos;

    }
}