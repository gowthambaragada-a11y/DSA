class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int m=nums[nums.length/2],c=0;
        for(int i:nums){
            if(i==m)c++;
            if(c>=2)return false;
        }
        return true;
    }
}