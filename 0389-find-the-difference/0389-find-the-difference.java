class Solution {
    public char findTheDifference(String s, String t) {
        //using XOR operator
        //converting string to char-Array
        char ch=0;
        for(char c : s.toCharArray()) ch ^= c;
        for(char c : t.toCharArray()) ch ^= c;
        return ch;
    }
}