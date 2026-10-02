class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        h("",0,0,ans,n);
        return ans;
    }
    void h(String s,int o,int c,List<String> l,int n){
        if(s.length()==n*2){
            l.add(s);
            return;
        }
        if(o<n)h(s+'(',o+1,c,l,n);
        if(c<o)h(s+')',o,c+1,l,n);
    } 
}