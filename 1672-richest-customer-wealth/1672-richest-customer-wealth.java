class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0;
        for(int []i:accounts){
            int s=0;
            for(int j:i)s+=j;
            m=Math.max(s,m);
        }
        return m;
    }
}