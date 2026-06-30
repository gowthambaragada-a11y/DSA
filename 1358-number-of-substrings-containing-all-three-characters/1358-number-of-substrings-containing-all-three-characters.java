class Solution {
    public int numberOfSubstrings(String s) {
        int c=0,l=0;
        int f[]=new int[3];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
            while(f[0]>0 && f[1]>0 && f[2]>0){
                c+=s.length()-i;
                f[s.charAt(l)-'a']--;
                l++;
            }
        }
        return c;
    }
}