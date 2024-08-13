class Solution {
    
    public static void helper(int[] nums,List<List<Integer>> ans,List<Integer> l){
        if(l.size()==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        
        for(int j=0;j<nums.length;j++){
            if(!l.contains(nums[j])){
                l.add(nums[j]);
                helper(nums,ans,l);
                l.remove(l.size()-1);
            }
            
        }
        
    }
    
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        helper(nums,ans,l);
        return ans;
    }

}