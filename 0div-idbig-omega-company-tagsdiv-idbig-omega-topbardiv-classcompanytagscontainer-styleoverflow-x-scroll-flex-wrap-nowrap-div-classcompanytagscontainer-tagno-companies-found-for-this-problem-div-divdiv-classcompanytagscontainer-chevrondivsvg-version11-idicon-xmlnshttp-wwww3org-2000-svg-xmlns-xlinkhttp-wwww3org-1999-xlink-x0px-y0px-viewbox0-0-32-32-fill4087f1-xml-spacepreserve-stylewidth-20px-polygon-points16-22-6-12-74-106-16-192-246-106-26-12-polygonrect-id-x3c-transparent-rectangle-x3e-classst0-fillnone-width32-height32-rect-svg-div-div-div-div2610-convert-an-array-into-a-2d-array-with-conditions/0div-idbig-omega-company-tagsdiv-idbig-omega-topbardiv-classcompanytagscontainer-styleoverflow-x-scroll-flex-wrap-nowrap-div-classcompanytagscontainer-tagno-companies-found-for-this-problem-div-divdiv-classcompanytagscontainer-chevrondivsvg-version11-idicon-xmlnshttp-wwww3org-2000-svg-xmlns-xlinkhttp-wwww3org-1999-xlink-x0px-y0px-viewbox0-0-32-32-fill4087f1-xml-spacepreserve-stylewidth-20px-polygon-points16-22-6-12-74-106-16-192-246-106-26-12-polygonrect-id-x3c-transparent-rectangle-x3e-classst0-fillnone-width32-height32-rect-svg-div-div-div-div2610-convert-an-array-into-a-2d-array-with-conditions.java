class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> set=map.keySet();

        int max=-1;
        for(int i : set){
            max=Math.max(max,map.get(i));
        }
        
        int j=0;
        while(j<max){
            List<Integer> list=new ArrayList<>();
            for(int i : set){
                int val=i;
                if(map.get(val)!=0){
                    if(list.contains(val)==false || list.size()==0){
                        list.add(val);
                        map.put(val,map.get(val)-1);
                    }
                }
            }
            ans.add(list);j++;
        }
        
        return ans;
        
    }
}