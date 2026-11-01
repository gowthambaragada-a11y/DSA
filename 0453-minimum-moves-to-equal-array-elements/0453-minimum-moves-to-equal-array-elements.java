class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i:nums)m=Math.min(m,i);
        int a=0;
        for(int i:nums)a+=i-m;
        return a;
    }
}