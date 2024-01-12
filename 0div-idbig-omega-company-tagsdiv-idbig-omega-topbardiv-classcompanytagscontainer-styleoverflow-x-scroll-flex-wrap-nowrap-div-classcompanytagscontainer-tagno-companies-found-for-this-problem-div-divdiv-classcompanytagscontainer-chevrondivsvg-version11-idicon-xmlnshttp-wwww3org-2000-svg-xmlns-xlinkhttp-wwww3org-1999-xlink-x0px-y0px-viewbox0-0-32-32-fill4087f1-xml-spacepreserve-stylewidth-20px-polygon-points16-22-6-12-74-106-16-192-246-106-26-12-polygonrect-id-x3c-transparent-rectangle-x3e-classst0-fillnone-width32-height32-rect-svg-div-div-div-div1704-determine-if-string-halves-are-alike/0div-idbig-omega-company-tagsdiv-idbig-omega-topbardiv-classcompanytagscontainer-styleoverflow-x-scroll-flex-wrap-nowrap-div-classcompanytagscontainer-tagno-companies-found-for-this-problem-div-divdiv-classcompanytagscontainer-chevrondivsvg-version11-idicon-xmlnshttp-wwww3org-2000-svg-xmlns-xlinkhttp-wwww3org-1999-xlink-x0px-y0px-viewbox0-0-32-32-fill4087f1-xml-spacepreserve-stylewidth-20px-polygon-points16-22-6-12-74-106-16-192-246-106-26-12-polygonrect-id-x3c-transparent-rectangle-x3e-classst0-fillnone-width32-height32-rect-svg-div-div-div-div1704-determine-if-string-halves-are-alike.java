class Solution {
    
    public static int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')count++;
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int count1=count(a);
        int count2=count(b);
        if(count1==count2)return true;
        return false;
    }
}