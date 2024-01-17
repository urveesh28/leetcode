class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i : arr){
           map.put(i,map.getOrDefault(i,0)+1);
       }

       Set<Integer> set1=map.keySet();
       Set<Integer> set2=new HashSet<>();
       for(int i : set1){
           if(!set2.contains(map.get(i)))set2.add(map.get(i));
           else return false;
       }
       return true;
    }
}