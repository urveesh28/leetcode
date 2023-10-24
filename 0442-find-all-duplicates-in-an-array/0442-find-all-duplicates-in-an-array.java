class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //using mapping
        List<Integer> list=new ArrayList<>();
        int[] map=new int[nums.length+1];
        
        for(int i : nums){
            map[i]+=1;
        }

        for(int i=1;i<map.length;i++){
            if(map[i]==2){
                list.add(i);
            }
        }

        return list;
    }
}