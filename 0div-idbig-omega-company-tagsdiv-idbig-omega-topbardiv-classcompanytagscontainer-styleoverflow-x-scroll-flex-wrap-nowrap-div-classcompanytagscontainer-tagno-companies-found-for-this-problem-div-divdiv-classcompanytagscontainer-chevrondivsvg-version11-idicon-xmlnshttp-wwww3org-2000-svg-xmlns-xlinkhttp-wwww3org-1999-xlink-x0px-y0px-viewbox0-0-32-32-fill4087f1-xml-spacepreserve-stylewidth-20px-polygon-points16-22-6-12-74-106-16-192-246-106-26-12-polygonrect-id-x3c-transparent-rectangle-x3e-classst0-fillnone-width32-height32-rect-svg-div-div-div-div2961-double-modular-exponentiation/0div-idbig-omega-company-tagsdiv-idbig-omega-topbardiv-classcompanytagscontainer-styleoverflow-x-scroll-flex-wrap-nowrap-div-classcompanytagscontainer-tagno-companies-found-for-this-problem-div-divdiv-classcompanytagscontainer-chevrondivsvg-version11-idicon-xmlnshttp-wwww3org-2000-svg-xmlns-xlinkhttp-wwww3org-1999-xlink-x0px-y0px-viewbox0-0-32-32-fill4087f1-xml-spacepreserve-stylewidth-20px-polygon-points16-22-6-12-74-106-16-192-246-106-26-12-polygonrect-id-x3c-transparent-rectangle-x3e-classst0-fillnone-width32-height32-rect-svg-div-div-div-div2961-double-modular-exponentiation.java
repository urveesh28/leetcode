class Solution {
    public List<Integer> getGoodIndices(int[][] v, int target) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<v.length;i++){
            long a=v[i][0];
            long b=v[i][1];
            long c=v[i][2];
            long m=v[i][3];
            a=a%10;
            long d=1;
            for(int j=0;j<b;j++){
                d=(d*a)%10;
            }
            long val=1;
            for(int j=0;j<c;j++){
                val=(d*val)%m;
            }
            System.out.println(val);
            if(val==target)list.add(i);
        }
        return list;
    }
}