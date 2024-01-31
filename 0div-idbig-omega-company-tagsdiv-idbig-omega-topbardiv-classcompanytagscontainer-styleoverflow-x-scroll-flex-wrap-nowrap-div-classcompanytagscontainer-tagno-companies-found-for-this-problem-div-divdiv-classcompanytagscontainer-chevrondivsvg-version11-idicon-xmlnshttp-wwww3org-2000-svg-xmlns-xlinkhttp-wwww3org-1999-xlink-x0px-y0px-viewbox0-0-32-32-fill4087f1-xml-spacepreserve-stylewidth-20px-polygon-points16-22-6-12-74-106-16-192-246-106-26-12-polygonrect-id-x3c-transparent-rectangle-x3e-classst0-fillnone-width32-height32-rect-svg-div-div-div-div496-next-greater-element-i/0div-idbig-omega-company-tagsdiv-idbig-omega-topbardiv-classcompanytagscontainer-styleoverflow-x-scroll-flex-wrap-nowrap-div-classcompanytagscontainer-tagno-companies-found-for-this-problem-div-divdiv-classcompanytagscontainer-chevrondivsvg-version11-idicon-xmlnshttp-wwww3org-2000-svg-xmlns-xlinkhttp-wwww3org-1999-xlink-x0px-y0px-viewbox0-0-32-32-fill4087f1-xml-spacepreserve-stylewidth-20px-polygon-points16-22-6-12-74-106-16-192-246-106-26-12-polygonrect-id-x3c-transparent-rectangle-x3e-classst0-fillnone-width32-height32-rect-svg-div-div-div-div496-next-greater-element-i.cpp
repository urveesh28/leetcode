class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
                
        for(int i=0;i<nums1.size();i++){
            int maxi=nums1[i];
            int digit = nums1[i];
            auto it =find(nums2.begin(), nums2.end(),digit);
            // cout <<*it<<endl;
            it+=1;
            while(it !=nums2.end()){
                if(*it>maxi){
                    maxi=*it;
                    break;
                } 
                it++;
            }
            if(maxi==nums1[i]) nums1[i]=-1;
            else nums1[i]=maxi;
        }
        return nums1;
    }
};