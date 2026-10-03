class Solution {
    public int longestValidParentheses(String sta) {
        Stack<Integer>s=new Stack<>();int count=0;
        s.push(-1);
        for(int i=0;i<sta.length();i++){
            if(sta.charAt(i)=='(')s.push(i);
            else{
                s.pop();
                if(s.isEmpty())s.push(i);
                else{
                    if(count<i-s.peek())count=i-s.peek();
                }
            }
        }
        return count;
    }
}