class Solution {
    public int maxVowels(String s, int k) {
        int v=0,m;
        for(int i=0;i<k;i++)if(isvowel(s.charAt(i)))v++;
        m=v;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i-k)))v--;
            if(isvowel(s.charAt(i)))v++;
            if(m<v)m=v;
        }
        return m;
    }
    boolean isvowel(char c){
        return c=='a'||c=='i'||c=='o'||c=='e'||c=='u';
    }
}