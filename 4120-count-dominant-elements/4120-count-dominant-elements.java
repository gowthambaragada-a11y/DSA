class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1)return 1;
        int c=0;
        if(nums[0]>=nums[1])c++;
        if(nums[nums.length-1]>=nums[nums.length-2])c++;
        for(int i=1;i<nums.length-1;i++)if(nums[i]*2>=(nums[i-1]+nums[i+1]))c++;
        return c;
    }
}