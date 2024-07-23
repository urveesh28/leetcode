class Pair{
    int n;
    int f;

    public Pair(int n,int f){
        this.n=n;
        this.f=f;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int k=0;
        Pair[] arr=new Pair[map.size()];
        for(int i : map.keySet()){
            arr[k++]=new Pair(i,map.get(i));
        }

        k=0;
        Arrays.sort(arr,(a,b)->{
            if(a.f!=b.f){
                return a.f-b.f;
            }
            return b.n-a.n;
        });
        
        for(int i=0;i<arr.length;i++){
            int v=arr[i].n;
            int freq=arr[i].f;
            
            while(freq>0){
                nums[k++]=v;
                freq--;
            }
        }

        return nums;
    }
}