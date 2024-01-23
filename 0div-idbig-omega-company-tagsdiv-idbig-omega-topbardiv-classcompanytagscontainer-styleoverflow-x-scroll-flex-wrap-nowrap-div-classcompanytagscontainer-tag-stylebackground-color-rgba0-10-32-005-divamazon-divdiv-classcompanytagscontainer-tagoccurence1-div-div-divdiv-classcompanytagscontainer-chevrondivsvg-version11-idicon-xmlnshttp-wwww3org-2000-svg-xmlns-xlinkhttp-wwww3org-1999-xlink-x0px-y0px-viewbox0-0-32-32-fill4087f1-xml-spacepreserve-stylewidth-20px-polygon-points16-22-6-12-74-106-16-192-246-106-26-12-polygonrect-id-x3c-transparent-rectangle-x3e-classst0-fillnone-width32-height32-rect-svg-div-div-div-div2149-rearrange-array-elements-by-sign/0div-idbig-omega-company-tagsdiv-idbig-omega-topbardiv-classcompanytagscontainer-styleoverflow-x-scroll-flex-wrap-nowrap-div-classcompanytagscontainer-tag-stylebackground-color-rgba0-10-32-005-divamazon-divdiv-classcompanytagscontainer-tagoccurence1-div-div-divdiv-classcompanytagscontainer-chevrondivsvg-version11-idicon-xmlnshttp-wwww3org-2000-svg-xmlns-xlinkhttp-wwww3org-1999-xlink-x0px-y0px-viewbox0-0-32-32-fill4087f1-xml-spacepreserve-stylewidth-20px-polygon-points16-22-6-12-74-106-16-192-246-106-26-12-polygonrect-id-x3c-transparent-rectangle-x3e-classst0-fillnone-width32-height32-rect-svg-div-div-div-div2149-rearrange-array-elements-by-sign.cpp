class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector< int > neg , pos ;
        for ( auto a : nums ) {
            if ( a < 0 ) neg.push_back( a ) ;
            if ( a > 0 ) pos.push_back( a ) ;
        }

        int n = nums.size() , left = 0 , right = 0  ;
        for ( int i = 0 ; i < n ; i++ ) {
            if ( i % 2 == 0 ) {
                nums[ i ] = pos[ left++ ] ;
            } else{
                nums[ i ] = neg[ right++ ] ;
            }
        }

        return nums ;
    }
};