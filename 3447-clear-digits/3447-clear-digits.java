class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()){
                stk.add(s.charAt(i));
            }
            
            else if(s.charAt(i)<='9' && s.charAt(i)>='0'){
                stk.pop();
            }
            
            else{
                stk.add(s.charAt(i));
            }
        }
        String ans="";
        while(stk.size()>0){
            ans=stk.pop()+ans;
        }
        return ans;
    }
}