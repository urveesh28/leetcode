class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int k=capacity;
        for(int i=0;i<plants.length;){
            if(capacity>=plants[i]){
                steps++;
                capacity-=plants[i];
                i++;
            }
            else{
                steps+=2*i;
                capacity=k;
            }
        }
        return steps;
    }
}