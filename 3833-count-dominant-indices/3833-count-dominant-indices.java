class Solution {
    public int dominantIndices(int[] nums) {
        int s=0,c=0;
        for(int i:nums)s+=i;
        for(int i=0;i<=nums.length-2;i++){
            s-=nums[i];
            if(nums[i]>(s/(nums.length-i-1)))c++;
        }
        return c;
    }
}