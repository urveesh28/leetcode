class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        /*
        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0;i<target.length;i++){
            if(target[i]!=arr[i])return false;
        }

        return true;
        */

        //using hashmap
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
            map2.put(target[i],map2.getOrDefault(target[i],0)+1);
        }

        //boolean method 
        return map1.equals(map2);
    }
}