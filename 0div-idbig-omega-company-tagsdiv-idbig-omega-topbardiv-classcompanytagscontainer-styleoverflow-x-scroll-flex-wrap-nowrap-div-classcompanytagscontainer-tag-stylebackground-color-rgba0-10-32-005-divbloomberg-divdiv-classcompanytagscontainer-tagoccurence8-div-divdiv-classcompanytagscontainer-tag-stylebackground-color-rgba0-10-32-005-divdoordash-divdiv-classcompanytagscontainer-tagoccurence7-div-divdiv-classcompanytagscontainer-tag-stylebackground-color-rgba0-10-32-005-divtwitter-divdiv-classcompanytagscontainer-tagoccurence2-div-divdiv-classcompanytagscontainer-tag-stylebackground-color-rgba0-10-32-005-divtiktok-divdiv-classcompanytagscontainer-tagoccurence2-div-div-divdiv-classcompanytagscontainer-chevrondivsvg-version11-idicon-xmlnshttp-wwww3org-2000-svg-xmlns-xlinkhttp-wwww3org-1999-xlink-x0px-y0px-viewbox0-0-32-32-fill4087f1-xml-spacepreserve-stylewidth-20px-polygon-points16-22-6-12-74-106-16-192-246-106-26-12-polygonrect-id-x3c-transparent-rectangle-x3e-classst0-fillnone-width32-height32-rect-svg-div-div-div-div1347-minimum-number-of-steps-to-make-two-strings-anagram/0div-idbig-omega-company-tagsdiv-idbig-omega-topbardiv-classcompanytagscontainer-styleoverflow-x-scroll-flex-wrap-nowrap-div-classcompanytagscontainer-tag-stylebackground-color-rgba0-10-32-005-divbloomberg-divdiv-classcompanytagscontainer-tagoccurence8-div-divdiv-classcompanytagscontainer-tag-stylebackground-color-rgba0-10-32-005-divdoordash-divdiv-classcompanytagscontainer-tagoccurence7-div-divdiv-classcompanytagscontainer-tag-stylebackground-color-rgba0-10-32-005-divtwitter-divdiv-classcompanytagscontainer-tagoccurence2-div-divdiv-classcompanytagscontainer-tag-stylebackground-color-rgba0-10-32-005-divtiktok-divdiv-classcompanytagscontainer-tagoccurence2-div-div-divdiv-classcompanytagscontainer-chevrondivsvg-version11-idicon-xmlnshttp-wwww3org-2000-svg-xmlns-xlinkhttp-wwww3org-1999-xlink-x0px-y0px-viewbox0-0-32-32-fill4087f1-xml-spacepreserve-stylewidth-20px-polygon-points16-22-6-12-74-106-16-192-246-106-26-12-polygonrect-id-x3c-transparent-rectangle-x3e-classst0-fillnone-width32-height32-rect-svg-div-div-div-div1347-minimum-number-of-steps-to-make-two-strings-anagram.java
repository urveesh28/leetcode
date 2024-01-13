class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        int count=0;
        Set<Character> set=map1.keySet();
        for(char ch : set){
            if(map1.get(ch)>map2.getOrDefault(ch,0)){
                count+=(map1.get(ch)-map2.getOrDefault(ch,0));
            }
        }
        return count;
    }
}