class Solution {
    public int findPeakElement(int[] nums) {
        int r=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                r=i;
            }
        }return r;
    }
}