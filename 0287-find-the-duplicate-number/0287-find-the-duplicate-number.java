class Solution {
    public int findDuplicate(int[] nums) {
        /*HashSet<Integer> set=new HashSet<>();
        for(int i : nums){
            if(set.contains(i))return i;
            else set.add(i);
        }
        return 1;*/

        //using 2nd approach
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(nums[index]<0)return index;
            nums[index]=-nums[index];
        }
        return 0;
    }
}