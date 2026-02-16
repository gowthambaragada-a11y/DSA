class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'&&!st.isEmpty())st.pop();
            else st.add(c);
        }
        String r="";
        while(!st.isEmpty())r+=st.pop();
        return new StringBuilder(r).reverse().toString();
    }
}