class Solution {
    public int countSpecialIntegers(int[] nums) {
        int c=0;
        int f[]=new int[100+1];
        for(int i:nums)f[i]++;
        for(int i=0;i<nums.length;i++){
            if(f[nums[i]]!=3)continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    int d=j-i;
                    if(j+d<nums.length && nums[j+d]==nums[j])c++;
                }
            }
        }
        return c;
    }
}