class Solution {
    public int minChanges(String s) {
        int i=0,c=0;
        while(i+1<s.length()){
            if(s.charAt(i)!=s.charAt(i+1))c++;
            i++;i++;
        }
        return c;
    }
}