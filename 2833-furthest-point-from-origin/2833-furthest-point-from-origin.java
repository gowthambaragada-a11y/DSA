class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cr=0,cl=0,cb=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L')cl++;
            if(ch=='R')cr++;
            if(ch=='_')cb++;
        }
        if(cl>cr)cl+=cb;
        else cr+=cb;
        return Math.abs(cl-cr);
    }
}