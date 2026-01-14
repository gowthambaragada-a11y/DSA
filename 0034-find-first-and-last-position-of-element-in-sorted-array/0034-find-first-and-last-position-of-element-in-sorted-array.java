class Solution {
    public int[] searchRange(int[] nums, int target) {
        int r[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(r[0]==-1){
                    r[0]=i;
                    r[1]=i;
                }
                else r[1]=i;
            }
            if(nums[i]>target)break;
        }
        return r;
    }
}