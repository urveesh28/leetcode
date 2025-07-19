class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> ans=new ArrayList<>();
        float ans1=a/b;
        ans.add(ans1);
        ans1=Float.parseFloat(String.format("%.3f",ans1));
        ans.add(ans1);
        return ans;
    }
}