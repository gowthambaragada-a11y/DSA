class Solution {
    int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return gcd(max,min);
    }
}