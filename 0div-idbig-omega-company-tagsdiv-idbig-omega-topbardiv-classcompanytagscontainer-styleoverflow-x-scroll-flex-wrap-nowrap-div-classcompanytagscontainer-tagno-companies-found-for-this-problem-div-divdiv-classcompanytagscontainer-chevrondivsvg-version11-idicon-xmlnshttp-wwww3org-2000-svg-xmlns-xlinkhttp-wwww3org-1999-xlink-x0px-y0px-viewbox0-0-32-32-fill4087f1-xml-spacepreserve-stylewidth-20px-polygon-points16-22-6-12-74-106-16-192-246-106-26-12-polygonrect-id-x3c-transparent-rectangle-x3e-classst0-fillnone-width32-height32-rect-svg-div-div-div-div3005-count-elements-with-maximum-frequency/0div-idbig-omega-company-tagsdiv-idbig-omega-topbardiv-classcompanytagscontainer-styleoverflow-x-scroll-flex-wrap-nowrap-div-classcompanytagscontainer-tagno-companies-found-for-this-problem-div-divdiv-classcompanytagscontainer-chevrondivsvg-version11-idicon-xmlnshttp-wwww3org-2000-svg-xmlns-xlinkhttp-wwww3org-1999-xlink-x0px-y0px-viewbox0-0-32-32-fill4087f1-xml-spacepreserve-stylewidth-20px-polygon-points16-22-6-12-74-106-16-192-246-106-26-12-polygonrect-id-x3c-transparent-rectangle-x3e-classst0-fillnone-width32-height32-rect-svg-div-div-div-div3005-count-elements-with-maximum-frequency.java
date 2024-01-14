class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=-1;
        int count=0;
        Set<Integer> set=map.keySet();
        for(int i : set)max=(max>map.get(i))?max:map.get(i);
        for(int i : set)if(map.get(i)==max)count+=map.get(i);
        return count;
    }
}