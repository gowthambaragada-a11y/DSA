class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int p=n;
        int[] f=new int[2*n+1];
        f[n]=1;
        long l=0;
        long a=0;
        for(int num:nums){
            if(num==target){
                l+=f[p];
                p++;
            }else{
                p--;
                l-=f[p];
            }
            f[p]++;
            a+=l;
        }
        return a;
    }
}