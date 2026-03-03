class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char []arr=s.toCharArray();
        while(l<r){
            if(v(arr[l]) &&v(arr[r])){
                char t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
                r--;
            }
            if(!v(arr[l]))l++;
            if(!v(arr[r]))r--;
        }
        String re=new String (arr);
        return re;
    }
    boolean v(char a){
        String c="aeiouAEIOU";
        for(char ch:c.toCharArray())if(ch==a)return true;
        return false;
    }
}