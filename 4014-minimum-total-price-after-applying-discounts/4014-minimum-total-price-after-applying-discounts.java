class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double ans=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int a1=prices.length-1,a2=discounts.length-1;
        while(a1>=0 && a2>=0){
            int p=prices[a1],d=discounts[a2];
            ans+=(p*(100.0-d)/100.0);
            a1--;
            a2--;
        }
        while(a1>=0){
            ans+=prices[a1];
            a1--;
        }
        return ans;
    }
}