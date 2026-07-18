class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=0,s2=0;
        String s="";
        while(s1<word1.length()&&s2<word2.length()){
            s+=word1.charAt(s1);
            s+=word2.charAt(s2);
            s1++;
            s2++;
        }
        while(s1<word1.length()){
            s+=word1.charAt(s1);
            s1++;
        }
        while(s2<word2.length()){
            s+=word2.charAt(s2);
            s2++;
        }
        return s;
    }
}