class Solution {
    public double myPow(double x, int n) {
        if(x==1 ||n==0)return 1;
        if(x==0)return 0;
        if(n<0){
            x=1/x;
            n=-n;
        }
        long N=n;
        return mypow(x,N);
    }
    public double mypow(double x,long n){
        if(n==0)return 1;
        double h=mypow(x,n/2);
        return (n%2==0)?h*h:h*h*x;
    }
}