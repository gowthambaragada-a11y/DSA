class Solution {
    public boolean isGoodArray(int[] nums) {
        int g=nums[0];
        for(int i=1;i<nums.length;i++){
            g=gcd(g,nums[i]);
        }
        return g==1;
    }
    int gcd(int a,int b){
        return (a==0)?b:gcd(b%a,a);
    }
}