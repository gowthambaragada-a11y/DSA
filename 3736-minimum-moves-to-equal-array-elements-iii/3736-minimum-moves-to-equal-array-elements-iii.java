class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MIN_VALUE,a=0;
        for(int i:nums)if(m<i)m=i;
        for(int i:nums)a+=m-i;
        return a;
    }
}