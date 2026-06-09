class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=0;
        long min=Integer.MAX_VALUE;
        for(int n:nums){
            if(max<n)max=n;
            if(min>n)min=n;
        }
        return (max-min)*1L*k;
    }
}