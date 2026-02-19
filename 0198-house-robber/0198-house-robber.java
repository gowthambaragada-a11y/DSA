class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int m[]=new int[nums.length];
        m[0]=nums[0];
        m[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            m[i]=Math.max(m[i-1],nums[i]+m[i-2]);
        }
        return m[nums.length-1];
    }
}