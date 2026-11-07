class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in=true,d=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])d=false;
            if(nums[i]<nums[i-1])in=false;
        }
        return in||d;
    }
}