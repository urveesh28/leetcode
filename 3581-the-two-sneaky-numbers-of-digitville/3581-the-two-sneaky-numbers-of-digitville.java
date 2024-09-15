class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res=new int[2];
        int k=0;
        boolean[] map=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(!map[nums[i]]){
                map[nums[i]]=true;
            }
            else{
                res[k++]=nums[i];
            }
        }
        return res;
    }
}