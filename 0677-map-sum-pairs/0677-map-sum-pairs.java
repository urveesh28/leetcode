class MapSum {
    
    Map<String,Integer> map;
    public MapSum() {
        map=new HashMap<>();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int s=0;
        for(String str : map.keySet()){
            String key=str;
            if(prefix.length()>key.length())continue;
            else if(key.substring(0,prefix.length()).equals(prefix)){
                s+=map.get(key);
            }
        }

        return s;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */