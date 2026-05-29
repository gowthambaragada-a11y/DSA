class Solution {
    public int minElement(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i:nums){
            m=Math.min(m,d(i));
        }
        return m;
    }
    int d(int num){
        int t=0;
        while(num>0){
            t+=num%10;
            num/=10;
        }
        return t;
    }
}