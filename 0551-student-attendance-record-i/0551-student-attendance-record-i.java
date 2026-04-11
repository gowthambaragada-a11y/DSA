class Solution {
    public boolean checkRecord(String s) {
        int l=0,a=0;
        for(char ch:s.toCharArray()){
            if(ch=='A')a++;
            if(ch=='L')l++;
            else l=0;
            if(a>=2||l>=3)return false;
        }
        return true;
    }
}