class Solution {
    public int singleNonDuplicate(int[] nums) {
        boolean[] arr=new boolean[nums[nums.length-1]+1];
        //applying linear search
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(arr[val]==true){
                arr[val]=false;
            }
            else arr[val]=true;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==true){
                ans=i;
            }
        }
        /*int val=-1;
        for(int i : nums){
            if(set.contains(i))set.remove(i);
            else set.add(i);
        }
        for(int i : set){
            val=i;
        }
        return val;*/
        return ans;
    }
}