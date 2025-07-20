// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length()!=S2.length()){
            return 0;
        }
        
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        
        for(char ch : S1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        
        for(char ch : S2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        
        int flag=1;
        
        for(char ch : map1.keySet()){
            if(!map2.containsKey(ch) || map2.get(ch)!=map1.get(ch)){
                flag=0;
                break;
            }
        }
        
        map1.clear();
        map2.clear();
        
        return flag;
        
    }
}
