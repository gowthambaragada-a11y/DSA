class Solution {
    public String defangIPaddr(String address) {
        String r="";
        for(char i:address.toCharArray()){
            if(i=='.')r+="[.]";
            else r+=i;
        }
        return r;
    }
}