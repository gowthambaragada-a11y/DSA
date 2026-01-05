class Solution {
    public String largestEven(String s) {
        int count=0;
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2')break;
            else count++;
        }
        for(int i=0;i<=s.length()-1-count;i++)r+=s.charAt(i);
        return r;
    }
}