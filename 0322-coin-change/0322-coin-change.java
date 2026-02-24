class Solution {
    public int coinChange(int[] coins, int amount) {
        int m[]=new int[amount+1];
        Arrays.fill(m,amount+1);
        m[0]=0;
        for(int c:coins){
            for(int i=c;i<amount+1;i++)m[i]=Math.min(m[i],m[i-c]+1);
        }
        if(m[amount]==amount+1)return -1;
        return m[amount];
    }
}