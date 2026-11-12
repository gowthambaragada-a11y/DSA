class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // int dp1[]=new int[nums.length];
        // int dp2[]=new int[nums.length];
        // dp1[0]=1;dp2[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>nums[i-1])dp1[i]=dp1[i-1]+1;
        //     else dp1[i]=dp1[i-1];
        //     if(nums[i]<nums[i-1])dp2[i]=dp2[i-1]+1;
        //     else dp2[i]=dp2[i-1];
        // }
        // return Math.max(dp1[nums.length-1],dp2[nums.length-1]);

        // int in=0,d=0;
        // for(int i=0;i<nums.length;i++){
        //     int t=0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]>nums[j-1])t++;
        //         else break;
        //     }
        //     in=Math.max(t,in);
        // }
        // for(int i=0;i<nums.length;i++){
        //     int t=0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]<nums[j-1])t++;
        //         else break;
        //     }
        //     d=Math.max(t,d);
        // }
        // return Math.max(in,d)+1;

        int ml=1,inc=1,dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dec=1;
            }
            else if(nums[i]<nums[i-1]){
                inc=1;
                dec++;
            }
            else{
                inc=1;
                dec=1;
            }
            ml=Math.max(ml,Math.max(inc,dec));
        }
        return ml;
    }
}