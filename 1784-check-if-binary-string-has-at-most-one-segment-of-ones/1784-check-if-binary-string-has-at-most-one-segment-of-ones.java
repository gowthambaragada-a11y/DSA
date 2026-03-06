class Solution {
    public boolean checkOnesSegment(String s) {
        char []a=s.toCharArray();
        for(int i=0;i<a.length-1;i++)if(a[i]=='0'&&a[i+1]=='1')return false;
        return true;
    }
}