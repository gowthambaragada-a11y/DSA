class Solution {
    public int countConsistent(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)for(int j=i;j<nums.length;j++)if(h(nums,i,j))c++;
        return c;
    }
    boolean h(int []nums,int i,int j){
        int m=min(nums,i,j);
        int a=nums[i];
        for(int k=i+1;k<=j;k++)a=a&nums[k];
        return m==a;
    }
    int min(int []nums,int i,int j){
        int m=nums[i];
        for(int k=i;k<=j;k++)if(m>nums[k])m=nums[k];
        return m;
    }
}