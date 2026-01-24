class Solution {
    public String convert(String s, int numRows) {
        if(numRows>s.length()||numRows==1)return s;
        int cr=0;
        boolean f=true;
        String []r=new String[numRows];
        Arrays.fill(r,"");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(cr==0)f=true;
            if(cr==numRows-1)f=false;
            r[cr]+=c;
            if(f)cr++;
            else cr--;
        }
        String re="";
        for(String c:r)re+=c;
        return re;
    }
}