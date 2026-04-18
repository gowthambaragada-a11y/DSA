class Solution {
    public int mirrorDistance(int n) {
        int r=0,a=n;
        while(a>0){
            int t=a%10;
            r=r*10+t;
            a/=10;
        }
        return Math.abs(r-n);
    }
}