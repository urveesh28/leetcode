class Pair{
    int pos;
    int hlth;
    int no;
    char dir;

    public Pair(){
        this.pos=-1;
    }

    public Pair(int p,int h,int no,char d){
        this.pos=p;
        this.hlth=h;
        this.no=no;
        this.dir=d;
    }
}

class Checker implements Comparator<Pair>{
    @Override public int compare(Pair p1,Pair p2){
        return p1.pos-p2.pos;
    }
}

class Checker2 implements Comparator<Pair>{
    @Override public int compare(Pair p1,Pair p2){
        return p1.no-p2.no;
    }
}

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        //first sort the data based on the position (pos) field
        //implement stack 
        //perform sorting again based on the robots no (no) field
        //return the list
        
        int n=positions.length;

        Pair[] arr=new Pair[n];
        for(int i=0;i<positions.length;i++){
            arr[i]=new Pair(positions[i],healths[i],i,directions.charAt(i));
        }

        Arrays.sort(arr,new Checker());

        Stack<Pair> stk=new Stack<>();
        //case 1 if empty -> push
        //case 2 if stk.peek().dir & next values.dir are opposite apply opertaion(pop()) reduce the health
        //if same health pop() both 

        for(int i=0;i<n;i++){
            if(arr[i].dir=='R' || stk.empty() || stk.peek().dir=='L'){
                stk.push(arr[i]);
            }
            
            else if(arr[i].dir=='L'){
                boolean add=true;
                while(!stk.empty() && stk.peek().dir=='R' && add){
                    if(stk.peek().hlth > arr[i].hlth){
                        stk.peek().hlth--;
                        add=false;
                    }

                    else if(stk.peek().hlth < arr[i].hlth){
                        stk.pop();
                        arr[i].hlth--;
                    }

                    else{
                        stk.pop();
                        add=false;
                    }
                }

                if(add){
                    stk.push(arr[i]);
                }
            }

            
        }

        List<Pair> ans=new ArrayList<>(stk);
        Collections.sort(ans,new Checker2());

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            res.add(ans.get(i).hlth);
        }

        return res;
    }
}