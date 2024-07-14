class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                set.add(j);
            }
        }

        return set.size();
    }
}