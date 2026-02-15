class Solution {
    public int pivotIndex(int[] nums) {
        int tsum=0,s=0;
        for(int i=0;i<nums.length;i++)tsum+=nums[i];
        for(int i=0;i<nums.length;i++){
            if(tsum-s-nums[i]==s)return i;
            s+=nums[i];
        }
        return -1;
    }
}