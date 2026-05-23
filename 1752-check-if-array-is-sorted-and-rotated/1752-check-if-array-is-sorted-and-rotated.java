class Solution {
    public boolean check(int[] nums) {
        boolean f=false;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                if(f)return false;
                f=true;
            }
        }
        return true;
    }
}