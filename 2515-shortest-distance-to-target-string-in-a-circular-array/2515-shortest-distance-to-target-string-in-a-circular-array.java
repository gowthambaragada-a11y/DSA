class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int m=words.length,n=m;
        boolean f=false;
        for(int i=0;i<words.length;i++){
            if(target.equals(words[i])){
                f=true;
                int d=Math.abs(i-startIndex);
                m=Math.min(m,Math.min(d,n-d));
            }
        }
        return (f)?m:-1;
    }
}