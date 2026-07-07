class Solution {
    public long sumAndMultiply(int n) {
        long d=0,s=0,r=0;
        while(n>0){
            int di=n%10;
            if(di!=0){
                d=d*10+di;
                s+=di;
            }
            n/=10;
        }
        while(d>0){
            r=r*10+d%10;
            d/=10;
        }
        return r*s;
    }
}