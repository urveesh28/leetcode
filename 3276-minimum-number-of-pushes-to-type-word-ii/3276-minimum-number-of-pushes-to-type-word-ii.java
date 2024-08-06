
class Solution {
    public int minimumPushes(String word) {
        
        Map<Character,Integer> map=new HashMap<>();
        
        for(char ch : word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        
        int k=0;
        int[] arr=new int[map.size()];

        for(char i : map.keySet()){
            arr[k++]=map.get(i);
        }

        Arrays.sort(arr);
        int c=0;
        int count=1;
        k=0;

        

        for(int i=arr.length-1;i>=0;i--){
            if(k%8==0 && k>0){
                count++;
            }
            c+=(arr[i]*count);
            k++;
        }

        return c;

    }
}