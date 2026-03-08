class Solution {
    public int maxSubArray(int[] nums) {
        int s=0,m=nums[0];
        for(int i:nums){
            s+=i;
            m=Math.max(m,s);
            if(s<=0)s=0;
        }
        return m;
    }
}