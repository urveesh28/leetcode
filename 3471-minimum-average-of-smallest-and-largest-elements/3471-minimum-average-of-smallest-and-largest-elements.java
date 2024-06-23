class Solution {
    public double minimumAverage(int[] nums) {
        Queue<Integer> max=new PriorityQueue<>((a,b)->(b-a));
        Queue<Integer> min=new PriorityQueue<>((a,b)->(a-b));
        Queue<Double> ans=new PriorityQueue<>((a,b)->{
            if(a>b){
                return 1;
            }
            else if(b>a){
                return -1;
            }
            return 0;
        });

        for(int i : nums){
            max.offer(i);
            min.offer(i);
        }

        while(!max.isEmpty()){
            ans.offer((double)(max.poll()+min.poll())/2);
        }

        return ans.poll();
    }
}