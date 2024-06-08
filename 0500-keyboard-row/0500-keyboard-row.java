class Solution {
    public String[] findWords(String[] words) {
       String str1="qwertyupiop";
       String str2="asdfghjkl";
       String str3="zxcvbnm";

       Set<Character> set1=new HashSet<>();
       Set<Character> set2=new HashSet<>();
       Set<Character> set3=new HashSet<>();

       for(int i=0;i<str1.length();i++){
            set1.add(str1.charAt(i));
       }

       for(int i=0;i<str2.length();i++){
            set2.add(str2.charAt(i));
       }

       for(int i=0;i<str3.length();i++){
            set3.add(str3.charAt(i));
       }
       
       List<String> ans=new ArrayList<>();

       int c=0;
       int f=0;
       for(int i=0;i<words.length;i++){
            String str=words[i].toLowerCase();
            if(set1.contains(str.charAt(0))){
                for(int j=1;j<str.length();j++){
                    if(!set1.contains(str.charAt(j))){
                        f=1;
                        break;
                    }
                }
                if(f==0)ans.add(words[i]);
            }

            else if(set2.contains(str.charAt(0))){
                for(int j=1;j<str.length();j++){
                    if(!set2.contains(str.charAt(j))){
                        f=1;
                        break;
                    }
                }
                if(f==0)ans.add(words[i]);
            }

            else if(set3.contains(str.charAt(0))){
                for(int j=1;j<str.length();j++){
                    if(!set3.contains(str.charAt(j))){
                        f=1;
                        break;
                    }
                }
                if(f==0)ans.add(words[i]);
            }
            f=0;
       }

       String[] a=new String[ans.size()];
       for(int i=0;i<ans.size();i++){
        a[i]=ans.get(i);
       }

       return a;




    }
}