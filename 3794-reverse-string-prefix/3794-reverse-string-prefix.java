class Solution {
    public String reversePrefix(String s, int k) {
        String r="";
        for(int i=k-1;i>=0;i--)r+=s.charAt(i);
        while(k!=s.length()){
            r+=s.charAt(k);
            k++;
        }
        return r;
    }
}