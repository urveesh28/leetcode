class Solution {
    
    private static void helper(int n,String str,List<String> ans){
        if(n==0){
            ans.add(str);
            return;
        }

        int l=str.length();
        if(l==0 || str.charAt(l-1)!='0'){
            helper(n-1,str+"0",ans);
        }
        helper(n-1,str+"1",ans);
    }
    
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,"",ans);
        return ans;
    }
}