class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        List<Integer> winner=new ArrayList<>();
        List<Integer> loser=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            map1.put(matches[i][0],map1.getOrDefault(matches[i][0],0)+1);
            map2.put(matches[i][1],map2.getOrDefault(matches[i][1],0)+1);
        }

        Set<Integer> set1=map1.keySet();
        Set<Integer> set2=map2.keySet();
        for(int i : set1){
            if(!set2.contains(i))winner.add(i);
        }

        for(int i : set2){
            if(map2.get(i)==1)loser.add(i);
        }
        Collections.sort(winner);
        Collections.sort(loser);
        ans.add(winner);
        ans.add(loser);
        return ans;
    }
}