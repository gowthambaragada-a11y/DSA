class Solution {
    String reverse(String a){
        String r="";
        char []b=a.toCharArray();
        for(int i=b.length-1;i>=0;i--){
            r+=b[i];
        }
        return r;
    }
    public String reverseWords(String s) {
        String r="";
        String []a=s.split(" ");
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                 r+=reverse(a[i]);
                 break;
            }
            r+=reverse(a[i])+" ";

        }
        return r;
    }
}