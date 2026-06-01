class Solution {
    public int minimumCost(int[] cost) {
        int c=0,s=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if(c==2)c=0;
            else{
                s+=cost[i];
                c++;
            }
        }
        return s;
    }
}