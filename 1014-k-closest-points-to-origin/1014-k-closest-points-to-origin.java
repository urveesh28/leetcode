
class Solution {
    
    public static long helper(int a,int b){
        long ans=((long)a*a+(long)b*b);
        return ans;
    }
    
    public int[][] kClosest(int[][] points, int k) {
        Queue<long[]> pq=new PriorityQueue<>((a,b)->{
            return (int)(a[2]-b[2]);
        });

        for(int i=0;i<points.length;i++){
            long[] a=new long[3];
            a[0]=points[i][0];
            a[1]=points[i][1];
            a[2]=helper(points[i][0],points[i][1]);
            pq.add(a);
        }

        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            long[] a=pq.poll();
            ans[i][0]=(int)a[0];
            ans[i][1]=(int)a[1];
            
        }

        return ans;
    }
}