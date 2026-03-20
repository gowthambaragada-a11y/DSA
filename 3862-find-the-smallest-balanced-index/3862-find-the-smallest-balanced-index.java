class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long p=1,s=0;
        for(int i:nums)s+=i;
        for(int i=nums.length-1;i>=0;i--){
            s-=nums[i];
            if(s==p)return i;
            if(p>s/nums[i])break;
            p*=nums[i];
        }
        return -1;
    }
}