class Solution {
    final int m=1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int []t:queries){
            int l=t[0],r=t[1],k=t[2],v=t[3],ibx=l;
            while(ibx<=r){
                long temp=nums[ibx];
                nums[ibx]=(int)((temp*v)%m);
                ibx+=k;
            }
        }
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}