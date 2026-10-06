class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(')st.push(ch);
            else{
                if(st.isEmpty())c++;
                else st.pop();
            }
        }
        return c+st.size();
    }
}