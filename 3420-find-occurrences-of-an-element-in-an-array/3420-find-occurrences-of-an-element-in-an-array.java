class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> map=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                map.add(i);
            }
        }
        
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i]<=map.size()){
                res[i]=map.get(queries[i]-1);
            }
            else{
                res[i]=-1;
            }
        }

        return res;
    }
}