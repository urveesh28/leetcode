class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);

        //using 2nd approach
        //Dutch National Flag Algorithm
        int end=nums.length-1;
        int low=0;
        int mid=0;

        while(mid<=end){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
    }
}