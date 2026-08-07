#include <vector>
#include <algorithm>
using namespace std;
class Solution {
public:
    long long countRatioSubarrays(vector<int>& nums, int a, int b) {
        int n=nums.size();
        vector<long long>P(n+1,0);
        for(int i=0;i<n;++i){
            if(nums[i]%2==0)P[i+1]=P[i]+b;
            else P[i+1]=P[i]-a;
        }
        vector<long long> sorted_P=P;
        sort(sorted_P.begin(),sorted_P.end());
        sorted_P.erase(unique(sorted_P.begin(),sorted_P.end()),sorted_P.end());
        int m=sorted_P.size();
        vector<int> bit(m+1,0);
        auto add=[&](int idx,int val){
            for(;idx<=m;idx+=idx&-idx){
                bit[idx]+=val;
            }
        };
        auto query=[&](int idx){
            int sum=0;
            for(;idx>0;idx-=idx&-idx){
                sum+=bit[idx];
            }
            return sum;
        };
        long long ans=0;
        int inserted=0;
        for(int i=0;i<=n;++i){
            int rank=lower_bound(sorted_P.begin(),sorted_P.end(),P[i])-sorted_P.begin()+1;
            ans+=inserted-query(rank-1);
            add(rank,1);
            inserted++;
        }
        return ans;
    }
};