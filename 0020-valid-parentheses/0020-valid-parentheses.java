class Solution {
    public boolean isValid(String sta) {
        Stack<Character>s=new Stack<>();
        for(char c:sta.toCharArray()){
            if(c=='(' ||c=='{'||c=='[')s.push(c);
            else if(c==')'){
                if(!s.isEmpty()) {
                    char p=s.pop();
                    if(p!='(')return false;
                }else return false;
            }
            else if(c==']'){
                if(!s.isEmpty()){
                     char p=s.pop();
                     if(p!='[')return false;
                }else return false;
            }
            else{
                if(!s.isEmpty()){
                     char p=s.pop();
                     if(p!='{')return false;
                }else return false;
            }
        }
        if(!s.isEmpty())return false;
        return true;
    }
}