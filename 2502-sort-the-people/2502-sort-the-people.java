class Pair{
    int height;
    String name;

    public Pair(int h,String n){
        this.height=h;
        this.name=n;
    }
}


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Pair[] arr=new Pair[n];
        
        for(int i=0;i<n;i++){
            arr[i]=new Pair(heights[i],names[i]);
        }

        Arrays.sort(arr,(a,b)->{
            return (b.height-a.height);
        });

        for(int i=0;i<n;i++){
            names[i]=arr[i].name;
        }

        return names;
    }
}