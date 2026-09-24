class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(!s.equals("C") &&!s.equals("D")&&!s.equals("+")){
                int d=Integer.parseInt(s);
                st.add(d);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int t=st.peek();
                st.push(t*2);
            }
            else{
                int top=st.pop();
                int n=top+st.peek();
                st.push(top);
                st.push(n);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}