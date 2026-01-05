class Solution {
    public String largestEven(String s) {
        int index=0;
        String r="";
        for(int i=s.length()-1;i>=0;i--)if(s.charAt(i)=='2'){
            index=i;
            break;
        }
        if(index==0)return r;
        for(int i=0;i<=index;i++)r+=s.charAt(i);
        return r;
    }
}