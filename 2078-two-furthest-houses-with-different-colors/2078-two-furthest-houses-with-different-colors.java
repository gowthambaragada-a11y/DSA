class Solution {
    public int maxDistance(int[] colors) {
        int r=0;
        for(int i=0;i<colors.length;i++){
            for(int j=i;j<colors.length;j++){
                if(colors[i]!=colors[j])r=Math.max(r,Math.abs(i-j));
            }
        }
        return r;
    }
}