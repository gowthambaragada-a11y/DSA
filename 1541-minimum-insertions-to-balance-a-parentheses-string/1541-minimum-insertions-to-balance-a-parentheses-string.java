class Solution {
    public int minInsertions(String st) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i); 
            if (ch == '(') {
                s.push(ch);
            } else {
                if (i + 1 < st.length() && st.charAt(i + 1) == ')')i++;
                else count++;
                if (s.isEmpty())count++;
                else s.pop();
            }
        }
        count += s.size() * 2;
        return count;
    }
}