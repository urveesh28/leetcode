class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
      //Arrays.sort(points, Comparator.comparingDouble(o -> o[1]));
      int c=0;
     // ArrayList<Integer> ans=new ArrayList<>();
      c=1;
      //ans.add(0);
      int lastEnd=points[0][1];
      for(int i=1;i<points.length;i++){
          if(points[i][0]>lastEnd){
              c++;
              //ans.add(i);
              lastEnd=points[i][1];
          }
      }
      return c;
    }
}