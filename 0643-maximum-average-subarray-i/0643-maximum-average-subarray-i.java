class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++)sum+=nums[i];
        double m=sum*1.0/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            m=Math.max(m,sum*1.0/k);
        }
        return m;
    }
}