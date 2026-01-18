class Solution {
    public int trailingZeroes(int n) {
        int count=0,p=5;
        while(n>=p){
            count+=n/p;
            p*=5;
        }
        return count;
    }
}