class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int count=0;
        for(int i=0,j=0;j<nums.length;){
            if(nums[i]==nums[j]){
                count=j-i+1;
                if(count>(nums.length/3) && list.contains(nums[j])==false){
                    list.add(nums[j]);
                }
            }
            else{
                i=j;
                continue;
            }
            
            j++;
        }
        return list;
    }
}