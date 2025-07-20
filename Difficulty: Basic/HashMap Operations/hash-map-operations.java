/*You are required to complete below methods */
class GfG {
    /*Inserts an entry with key x and value y in map */
    void add_Value(HashMap<Integer, Integer> hm, int x, int y) {
        // Your code here
        hm.put(x,y);
    }

    /*Returns the value with key x from the map */
    int find_value(HashMap<Integer, Integer> hm, int x) {
        
        // Your code here
        if(hm.containsKey(x)){
            return hm.get(x);
        }
        else return -1;
    }

    /*Returns the size of the map */
        
    int getSize(HashMap<Integer, Integer> hm) {
        // Your code here
        return hm.size();
    }

        
    /*Removes the entry with key x from the map */
    void removeKey(HashMap<Integer, Integer> hm, int x) {
        // Your code here
        hm.remove(x);
    }
}