class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int m=nums.length;
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length;i++){
                if((nums[i]==1&&nums[j]==2)||nums[i]==2&&nums[j]==1)m=Math.min(m,Math.abs(i-j));
            }
        }
        if(nums.length==m)return -1;
        return m;
    }
}