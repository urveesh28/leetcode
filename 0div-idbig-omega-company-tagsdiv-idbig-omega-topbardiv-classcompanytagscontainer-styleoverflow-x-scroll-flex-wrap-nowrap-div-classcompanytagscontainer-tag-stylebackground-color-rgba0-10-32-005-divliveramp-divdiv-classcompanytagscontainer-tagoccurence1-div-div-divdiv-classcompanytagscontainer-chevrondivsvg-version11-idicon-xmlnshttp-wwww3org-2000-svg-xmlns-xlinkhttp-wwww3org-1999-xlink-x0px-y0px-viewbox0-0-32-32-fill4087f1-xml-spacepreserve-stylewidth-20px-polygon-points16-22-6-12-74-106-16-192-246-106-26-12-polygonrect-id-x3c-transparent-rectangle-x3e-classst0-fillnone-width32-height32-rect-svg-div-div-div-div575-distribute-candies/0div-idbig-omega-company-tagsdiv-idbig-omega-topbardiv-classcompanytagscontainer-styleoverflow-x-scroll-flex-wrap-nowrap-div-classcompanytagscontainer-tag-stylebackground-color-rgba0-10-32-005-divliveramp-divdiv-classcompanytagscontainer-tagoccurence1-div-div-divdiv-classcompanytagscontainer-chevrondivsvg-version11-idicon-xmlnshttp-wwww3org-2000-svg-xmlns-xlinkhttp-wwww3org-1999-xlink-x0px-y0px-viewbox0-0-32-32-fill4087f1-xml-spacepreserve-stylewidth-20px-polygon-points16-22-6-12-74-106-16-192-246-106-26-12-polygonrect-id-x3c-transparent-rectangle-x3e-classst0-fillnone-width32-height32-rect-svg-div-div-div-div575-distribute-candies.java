class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int i : candyType)set.add(i);
        int n=candyType.length;
        if(n/2>=set.size())return set.size();
        else return n/2;
    }
}