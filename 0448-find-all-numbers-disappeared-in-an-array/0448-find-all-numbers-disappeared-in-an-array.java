class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();;
    /*HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }

    for(int i=1;i<=nums.length;i++){
        if(!set.contains(i)){
            list.add(i);
        }
    }
    return list;*/

    boolean[] map=new boolean[nums.length+1];
    for(int i=0;i<nums.length;i++){
        if(map[nums[i]]==true)continue;
        else map[nums[i]]=true;
    }

    for(int i=1;i<map.length;i++){
        if(map[i]==false){
            list.add(i);
        }
    }
    return list;

    }
}