class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==0||nums.length==1)return 0;
        Arrays.sort(nums);
        int mg=nums[1]-nums[0];
        for(int i=1;i<nums.length;i++) mg=(mg<nums[i]-nums[i-1])?nums[i]-nums[i-1]:mg;
        return mg;
    }
}