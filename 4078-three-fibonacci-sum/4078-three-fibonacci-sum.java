class Solution {
    public boolean threeFibonacciSum(int n) {
        int f=0,s=1;
        int sum=0;
        while(true){
            sum=f+s;
            if(2*sum==n)return true;
            if(2*sum>n)return false;
            f=s;
            s=sum;
        }
    }
}