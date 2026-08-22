class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1,t=n;
        while(n>0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return t%(s+p)==0;
    }
}