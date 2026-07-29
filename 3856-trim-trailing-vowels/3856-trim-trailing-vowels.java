class Solution {
    public String trimTrailingVowels(String s) {
        String r="";
        int n=s.length()-1;
        while(n>=0){
            char c=s.charAt(n);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')n--;
            else break;
        }
        return s.substring(0,n+1);
    }
}