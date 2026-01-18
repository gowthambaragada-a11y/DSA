class Solution {
    public int countDigitOne(int n) {
        if(n<=0)return 0;
        String s=String.valueOf(n);
        int len=s.length();
        if(len==1)return n >= 1 ? 1 : 0;
        int highest=s.charAt(0)-'0';
        int pow=(int)Math.pow(10,len-1);
        int rest=n-highest*pow;
        if(highest==1)return countDigitOne(pow-1)+rest+1+countDigitOne(rest);
        else return highest*countDigitOne(pow-1)+pow+countDigitOne(rest);
    }
}