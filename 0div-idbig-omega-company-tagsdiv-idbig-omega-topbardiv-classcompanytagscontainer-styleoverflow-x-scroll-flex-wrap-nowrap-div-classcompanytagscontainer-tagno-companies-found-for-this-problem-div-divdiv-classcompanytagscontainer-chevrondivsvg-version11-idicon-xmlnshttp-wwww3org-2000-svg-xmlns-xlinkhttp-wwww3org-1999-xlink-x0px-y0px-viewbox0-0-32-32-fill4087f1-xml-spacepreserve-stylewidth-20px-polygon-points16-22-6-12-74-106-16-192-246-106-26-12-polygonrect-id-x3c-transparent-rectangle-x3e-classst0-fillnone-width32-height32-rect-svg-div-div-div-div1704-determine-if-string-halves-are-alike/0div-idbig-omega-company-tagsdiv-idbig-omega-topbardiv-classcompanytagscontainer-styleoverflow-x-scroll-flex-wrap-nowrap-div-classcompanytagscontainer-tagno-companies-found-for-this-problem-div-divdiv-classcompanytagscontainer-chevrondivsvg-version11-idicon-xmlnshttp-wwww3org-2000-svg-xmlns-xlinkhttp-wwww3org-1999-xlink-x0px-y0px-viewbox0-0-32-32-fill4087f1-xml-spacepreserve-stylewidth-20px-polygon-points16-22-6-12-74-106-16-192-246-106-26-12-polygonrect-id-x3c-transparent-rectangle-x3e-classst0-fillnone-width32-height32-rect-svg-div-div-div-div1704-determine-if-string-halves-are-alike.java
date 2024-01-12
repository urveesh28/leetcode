class Solution {
    
    public static int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        /*
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int count1=count(a);
        int count2=count(b);
        */

        //better approach
        int count1=0;
        int count2=0;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1=='a'||c1=='A'||c1=='e'||c1=='E'||c1=='i'||c1=='I'||c1=='o'||c1=='O'||c1=='u'||c1=='U')count1++;
            if(c2=='a'||c2=='A'||c2=='e'||c2=='E'||c2=='i'||c2=='I'||c2=='o'||c2=='O'||c2=='u'||c2=='U')count2++;
            i++;
            j--;
        }        
        if(count1==count2)return true;
        return false;
    }
}