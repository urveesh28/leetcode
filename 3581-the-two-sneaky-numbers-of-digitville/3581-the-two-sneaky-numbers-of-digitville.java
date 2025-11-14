class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] map=new int[nums.length-2];
        int[] ans=new int[2];
        int k=0;
        for(int i : nums){
            map[i]++;
        }

        for(int i=0;i<map.length;i++){
            if(map[i]>1){
                ans[k++]=i;
            }
        }

        return ans;

    }
}