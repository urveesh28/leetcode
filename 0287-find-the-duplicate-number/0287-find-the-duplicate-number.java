class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums){
            if(set.contains(i))return i;
            else set.add(i);
        }
        return 1;
    }
}