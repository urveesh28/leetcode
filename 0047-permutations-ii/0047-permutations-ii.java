class Solution {

    private static void helper(int[] nums,List<List<Integer>> ans,List<Integer> l,boolean[] flag){
        if(l.size()==nums.length){
            if(!ans.contains(l)){
                ans.add(new ArrayList<>(l));
                return;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                flag[i]=true;
                l.add(nums[i]);
                helper(nums,ans,l,flag);
                flag[i]=false;
                l.remove(l.size()-1);
            }

        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,ans,new ArrayList<Integer>(),new boolean[nums.length]);
        return ans;
    }
}