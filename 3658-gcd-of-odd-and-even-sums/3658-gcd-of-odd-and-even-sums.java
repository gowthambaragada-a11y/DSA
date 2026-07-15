class Solution {
    int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int o=0,e=0;
        for(int i=0;i<n;i++){
            o+=2*i+1;
            e+=2*i+2;
        }
        return gcd(o,e);
    }
}