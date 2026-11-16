class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k)return s;
        String t="";
        int l=0;
        int i=0;
        for(char c:s.toCharArray()){
            if(i==k){
                i=0;
                t+=Integer.toString(l);
                l=0;
            }
            l+=c-'0';
            i++;
        }
        t+=Integer.toString(l);
        return digitSum(t,k);
    }
}