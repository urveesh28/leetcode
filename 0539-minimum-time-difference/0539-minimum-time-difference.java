class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        int[] arr=new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            int h=Integer.parseInt(timePoints.get(i).substring(0,2));
            int m=h*60+Integer.parseInt(timePoints.get(i).substring(3,5));
            arr[i]=m;
        }

        Arrays.sort(arr);
        
        int min=10000;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(arr[i+1]-arr[i],min);
        }
        min=Math.min(min,1440+arr[0]-arr[arr.length-1]);
        return min;
    }
}