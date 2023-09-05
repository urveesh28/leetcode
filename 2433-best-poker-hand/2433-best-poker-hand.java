class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Character,Integer> str=new HashMap<>();
        for(int i : ranks){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        }

        for(char i : suits){
            if(str.containsKey(i)){
                str.put(i,str.get(i)+1);
            }
            else str.put(i,1);
        }
        
        for(int i : str.values()){
            if(i==5)return "Flush";
        }

        for(int i : map.values()){
            if(i>=3){
                return "Three of a Kind";
            }
        }

        for(int i : map.values()){
            if(i==2)return "Pair";
        }

        return "High Card";

    }
}