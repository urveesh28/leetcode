class Solution {
    
    private static String convert(String str){
        String res="";
        for(char ch : str.toCharArray()){
            int v=ch-'a'+1;
            res+=Integer.toString(v);
        }
        return res;
    }

    private static int sum(String str){
        int s=0;
        for(char ch : str.toCharArray()){
            s+=(ch-'0');
        }
        return s;
    }
    
    public int getLucky(String s, int k) {
        s=convert(s);
        int ans=sum(s);
        for(int i=1;i<k;i++){
            ans=sum(Integer.toString(ans));
        }
        return ans;
    }
}