class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++)nums[i]*=nums[i];
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        long ans=0;
        while(i<=j){
            if(i==j){
                ans+=nums[j];
                break;
            }
            ans-=nums[i];
            ans+=nums[j];
            i++;
            j--;
        }
        return ans;
    }
}