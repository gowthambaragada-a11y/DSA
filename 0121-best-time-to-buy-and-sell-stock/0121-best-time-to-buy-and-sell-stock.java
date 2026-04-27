class Solution {
    public int maxProfit(int[] prices) {
        int p=0,i=0,j=1;
        while(j<prices.length){
            int c=prices[j]-prices[i];
            if(prices[i]<prices[j]){
                p=Math.max(c,p);
            }
            else i=j;
            j++;
        }
        return p;
    }
}