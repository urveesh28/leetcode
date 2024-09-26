class Pair{
    int start;
    int end;

    public Pair(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class MyCalendar {

    List<Pair> arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(arr.isEmpty()){
            arr.add(new Pair(start,end));
            return true;
        }
        for(Pair p : arr){
            int s=p.start;
            int e=p.end;

            if(start<e && end>s){
                return false;
            } 
        }

        arr.add(new Pair(start,end));
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */