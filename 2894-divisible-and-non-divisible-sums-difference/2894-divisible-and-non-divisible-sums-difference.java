class Solution {
    public int differenceOfSums(int nu, int m) {
        int d=0,n=0;
        for(int i=1;i<=nu;i++){
            if(i%m==0)d+=i;
            if(i%m!=0)n+=i;
        }
        return n-d;
    }
}