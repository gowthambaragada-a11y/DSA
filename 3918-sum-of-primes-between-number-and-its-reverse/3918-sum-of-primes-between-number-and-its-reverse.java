class Solution {
    public int sumOfPrimesInRange(int n) {
        int min=Math.min(n,rev(n));
        int max=Math.max(n,rev(n));
        int sum=0;
        for(int i=min;i<=max;i++){
            if(isprime(i))sum+=i;
        }
        return sum;
    }
    static int rev(int n){
        int r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }
    static boolean isprime(int n){
        if(n<2)return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}