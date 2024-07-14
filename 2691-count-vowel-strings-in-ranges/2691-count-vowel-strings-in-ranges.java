class Solution {
    
    private static boolean isVowel(String w){
        char ch1=w.charAt(0);
        char ch2=w.charAt(w.length()-1);
        if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')&&(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')){
            return true;
        }
        return false;
    }
    
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] prefix=new int[n];
        int[] ans=new int[queries.length];

        prefix[0]=isVowel(words[0])?1:0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+(isVowel(words[i])?1:0);
        }

        int k=0;
        for(int[] i : queries){
            int u=i[0];
            int v=i[1];
            if(u-1<0){
                ans[k]=prefix[v];
            }
            else{
                ans[k]=prefix[v]-prefix[u-1];
            }
            k++;
        }

        return ans;
    }
}