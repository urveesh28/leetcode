class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans=new ArrayList<>();
        
        //concatenate both strings
        //use hashmap to put count of the words
        //traverse hashmap to find words whose count=1
        //store to the result

        s1=s1+" "+s2;
        String[] arr=s1.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String str : arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                ans.add(entry.getKey());
            }
        }

        int i=0;
        String[] res=new String[ans.size()];
        for(String str : ans){
            res[i++]=str;
        }
        return res;

    }
}