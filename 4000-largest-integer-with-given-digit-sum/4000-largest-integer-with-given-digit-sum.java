class Solution {
    public int largestInteger(int n, int s) {
        if(s>n*9)return -1;
        int r=0;
        for(int i=0;i<n;i++){
            int d=Math.min(9,s);
            r=r*10+d;
            s-=d;
        }
        return r;
    }
}