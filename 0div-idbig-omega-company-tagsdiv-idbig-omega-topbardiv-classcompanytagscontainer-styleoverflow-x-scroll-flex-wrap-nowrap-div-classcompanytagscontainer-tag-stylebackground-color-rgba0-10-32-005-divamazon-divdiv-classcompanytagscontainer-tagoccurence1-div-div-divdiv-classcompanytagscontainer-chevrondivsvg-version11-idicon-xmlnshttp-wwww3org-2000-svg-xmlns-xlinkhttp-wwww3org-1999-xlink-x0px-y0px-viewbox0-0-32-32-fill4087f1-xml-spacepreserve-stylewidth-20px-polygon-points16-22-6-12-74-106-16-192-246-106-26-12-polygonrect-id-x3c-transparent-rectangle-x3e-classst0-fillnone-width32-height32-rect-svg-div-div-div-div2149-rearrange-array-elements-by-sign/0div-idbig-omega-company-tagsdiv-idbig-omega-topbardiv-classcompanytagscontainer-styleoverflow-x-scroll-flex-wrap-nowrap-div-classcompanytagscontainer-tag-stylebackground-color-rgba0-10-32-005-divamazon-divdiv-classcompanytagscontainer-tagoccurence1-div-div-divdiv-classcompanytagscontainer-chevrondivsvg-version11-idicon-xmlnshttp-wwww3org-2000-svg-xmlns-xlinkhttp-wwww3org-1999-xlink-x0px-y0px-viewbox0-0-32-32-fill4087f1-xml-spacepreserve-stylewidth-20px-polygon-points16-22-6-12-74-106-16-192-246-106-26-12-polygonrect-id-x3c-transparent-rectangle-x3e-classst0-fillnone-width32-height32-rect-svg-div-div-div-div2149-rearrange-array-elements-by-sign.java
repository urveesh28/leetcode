class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive=new ArrayList<>();
        List<Integer> negative=new ArrayList<>();
        for(int i : nums){
            if(i<0)negative.add(i);
            else positive.add(i);
        }

        int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=positive.get(pos++);
            }
            else{
                nums[i]=negative.get(neg++);
            }
        }

        return nums;
    }
}