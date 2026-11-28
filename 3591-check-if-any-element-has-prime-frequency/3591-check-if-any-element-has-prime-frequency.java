class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int f[]=new int[101];
        for(int i:nums)f[i]++;
        for(int i:f)if(isprime(i))return true;
        return false;
    }
    boolean isprime(int n){
        return n==2||n==3||n==5||n==7||n==11||n==13||n==17||n==19||n==23||n==29||n==31||n==37||n==41||n==43||n==47||n==53||n==59||n==61||n==67||n==71||n==73||n==79||n==83||n==89||n==97;
    }
}