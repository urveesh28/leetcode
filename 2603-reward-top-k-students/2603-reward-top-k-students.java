class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k){
        List<Integer> ans=new ArrayList<>();
        Queue<int[]> pq=new PriorityQueue<>((a,b) -> {
            if(a[1]!=b[1]){
                return b[1]-a[1];
            }

            return a[0]-b[0];
        }); 

        Set<String> pos=new HashSet<>();
        Set<String> neg=new HashSet<>();

        for(String str : positive_feedback){
            pos.add(str);
        }

        for(String str : negative_feedback){
            neg.add(str);
        }

        for(int i=0;i<report.length;i++){
            String[] str=report[i].split(" ");
            int p=0;
            for(String s : str){
                if(neg.contains(s)){
                    p--;
                }
            }

            for(String s : str){
                if(pos.contains(s)){
                    p+=3;
                }
            }

            pq.offer(new int[]{student_id[i],p});
        }

        while(k-->0){
            ans.add(pq.poll()[0]);
        }

        return ans;
    }
}