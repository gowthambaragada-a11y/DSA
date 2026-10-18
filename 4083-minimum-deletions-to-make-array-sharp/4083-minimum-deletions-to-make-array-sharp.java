class Solution {
    public int minDeletions(int[] nums) {
        int c=0,i=1;
        while(i<nums.length){
            if(nums[i-1]==nums[i])c++;
            i++;
        }
        return c;
    }
}