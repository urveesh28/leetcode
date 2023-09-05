class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> rank=new HashMap<>();
        HashMap<Character,Integer> suit=new HashMap<>();
        for(int i : ranks){
            if(rank.containsKey(i)){
                rank.put(i,rank.get(i)+1);
            }
            else rank.put(i,1);
        }

        for(char i : suits){
            if(suit.containsKey(i)){
                suit.put(i,suit.get(i)+1);
            }
            else suit.put(i,1);
        }
        int maxsuit=0,maxrank=0;
        for(int i : suit.values()){
            maxsuit=Math.max(maxsuit,i);
        }

        for(int i : rank.values()){
            maxrank=Math.max(maxrank,i);
        }

        if(maxsuit==5)return "Flush";
        else if(maxrank>=3)return "Three of a Kind";
        else if(maxrank==2)return "Pair";
        return "High Card";

    }
}