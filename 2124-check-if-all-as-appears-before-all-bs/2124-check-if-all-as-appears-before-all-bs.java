class Solution {
    public boolean checkString(String s) {
        boolean a=false,b=false;
        for(char c:s.toCharArray()){
            if(c=='a'){
                a=true;
                if(a && b)return false;
            }
            if(c=='b')b=true;
        }
        return true;
    }
}