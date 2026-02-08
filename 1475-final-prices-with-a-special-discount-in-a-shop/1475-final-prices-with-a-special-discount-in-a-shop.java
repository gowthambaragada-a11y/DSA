class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!s.isEmpty()&&prices[s.peek()]>=prices[i]){
                int in=s.pop();
                prices[in]-=prices[i];
            }
            s.push(i);
        }
        return prices;
    }
}