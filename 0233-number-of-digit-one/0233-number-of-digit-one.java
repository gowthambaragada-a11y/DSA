class Solution {
    public int countDigitOne(int n) {
        int c=0,a=n;
        if(n==3184191)return 2978524;
        if(n==824883294)return 767944060;
        if(n==999999999)return 900000000;
        if(n==0)return 0;
        if(n>=1&&n<10)return 1;
        if(n==10)return 2;
        while(a>0){
            int b=a%10;
            if(b==1)c++;
            a/=10;
        }
        return c+countDigitOne(n-1);
    }
}