class Solution {
    public int minMergedInteger(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            String c=String.valueOf(nums[i])+String.valueOf(nums[i+1]);
            nums[i]=Integer.parseInt(c);
        }
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++)if(i%2==0)m=Math.min(m,nums[i]);
        return m;
    }
}