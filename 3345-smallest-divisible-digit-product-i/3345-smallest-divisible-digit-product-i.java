class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digit(n)%t==0)return n;
            n++;
        }
    }
    int digit(int n){
        int p=1;
        while(n>0){
            p*=(n%10);
            n/=10;
        }
        return p;
    }
}