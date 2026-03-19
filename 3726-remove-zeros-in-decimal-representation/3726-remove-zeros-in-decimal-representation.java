class Solution {
    public long removeZeros(long n) {
        String s=n+"";
        String r="";
        for(char c:s.toCharArray()){
            if(c!='0')r+=c;
        }
        return  Long.parseLong(r);
    }
}