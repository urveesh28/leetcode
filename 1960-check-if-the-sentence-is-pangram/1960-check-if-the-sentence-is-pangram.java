class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] map=new boolean[26];
        for(char ch : sentence.toCharArray()){
            map[ch-'a']=true;
        }

        for(boolean f : map){
            if(!f)return f;
        }

        return true;
    }
}