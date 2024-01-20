class Solution {
    
    public static boolean chk1(String word){
        int[] map=new int[26];
        for(int i=0;i<word.length();i++){
            map[word.charAt(i)-'a']++;
        }
        
        int max=1;
        int index=-1;
        for(int i=0;i<26;i++){
            if(max<map[i]){
                max=map[i];
                index=i;
            }
        }

        if(index==-1)return true;
        map[index]=map[index]-1;
        System.out.println(Arrays.toString(map));
        
        Set<Integer> set=new HashSet<>();
        for(int i : map){
            if(i>0)set.add(i);
        }

        System.out.println(set);

        if(set.size()>1)return false;
        return true;
    }

    public static boolean chk2(String word){
        int[] map=new int[26];
        for(int i=0;i<word.length();i++){
            map[word.charAt(i)-'a']++;
        }
        
        int min=word.length();
        int index=-1;
        for(int i=0;i<26;i++){
            if(map[i]<=min && map[i]!=0){
                min=map[i];
                index=i;
            }
        }

        map[index]=map[index]-1;
        System.out.println(Arrays.toString(map));
       Set<Integer> set=new HashSet<>();
        for(int i : map){
            if(i>0)set.add(i);
        }

        System.out.println(set);

        if(set.size()>1)return false;
        return true;
    }
    
    public boolean equalFrequency(String word) {
        boolean flag=(chk1(word) || chk2(word));
        return flag;
    }
}