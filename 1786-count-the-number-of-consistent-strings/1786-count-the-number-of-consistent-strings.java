class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] map=new boolean[26];
        int count=0;
        for(char ch : allowed.toCharArray()){
            map[ch-'a']=true;
        }

        for(String str : words){
            boolean flag=true;
            for(char ch : str.toCharArray()){
                if(!map[ch-'a']){
                    flag=false;
                    break;
                }
            }
            if(flag)count++;
        }

        return count;
    }
}