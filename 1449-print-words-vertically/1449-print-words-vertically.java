class Solution {
    public List<String> printVertically(String s) {
        List<String> list=new ArrayList<>();
        String[] arr=s.split(" ");
        
        //can be done using StringBuilder
        int no_of_words=0;
        for(String str : arr){
            no_of_words=Math.max(no_of_words,str.length());
        }

        for(int i=0;i<no_of_words;i++){
            String ans="";
            for(int j=0;j<arr.length;j++){
                if(i>=arr[j].length()){
                    ans+=" ";
                }
                else{
                    ans+=arr[j].charAt(i);
                }
            }
            list.add(ans);
        }

        for(int i=0;i<list.size();i++){
            String str=list.get(i).stripTrailing();
            list.set(i,str);
        }

        return list;
    }
}