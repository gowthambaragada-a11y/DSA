class Solution {
    public int commonFactors(int a, int b) {
        int r=gdc(a,b),c=0;
        for(int i=1;i<=r;i++){
            if(r%i==0)c++;
        }
        return c;
    }
    int gdc(int a,int b){
        return (a==0)?b:gdc(b%a,a);
    }
}