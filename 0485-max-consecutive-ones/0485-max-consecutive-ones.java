class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,in=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)in=i;
            else max=(max<i-in)?i-in:max;
        }
        return max;
    }
}