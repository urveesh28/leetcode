class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        //1,2,2,3,3,4,5,5,6
        return (nums[nums.length-k]);
    }
}