class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')v++;
            else{
                if((ch-'0'>=0 &&ch-'0'<=9 )||(int)ch==32){}
                else c++;
            }
        }
        if(c==0)return 0;
        return v/c;
    }
}