class Solution {
    public boolean isMonotonic(int[] nums) {
        return in(nums)||d(nums);
    }
    boolean in(int nums[]){
        for(int i=1;i<nums.length;i++)if(nums[i]<nums[i-1])return false;
        return true;
    }
    boolean d(int nums[]){
        for(int i=1;i<nums.length;i++)if(nums[i]>nums[i-1])return false;
        return true;
    }
}