class Solution {
    public int minimumDistance(int[] nums) {
        int m=Integer.MAX_VALUE,n=nums.length;
        boolean f=false;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int c=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        f=true;
                        m=Math.min(m,c);
                    }
                }
            }
        }

        if(!f)return -1;
        return m;
    }
}