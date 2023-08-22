class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int val=-1;
        for(int i : nums){
            if(set.contains(i))set.remove(i);
            else set.add(i);
        }
        for(int i : set){
            val=i;
        }
        return val;
    }
}