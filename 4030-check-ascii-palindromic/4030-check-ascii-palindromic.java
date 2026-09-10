class Solution {
    public boolean isPalindromic(String s) {
        String a="";
        for(char c:s.toCharArray()){
            a+=String.format("%8s",Integer.toBinaryString((int)c)).replace(' ','0');
        }
        int f=0,l=a.length()-1;
        while(f<=l){
            if(a.charAt(f)!=a.charAt(l))return false;
            f++;
            l--;
        }
        return true;
    }
}