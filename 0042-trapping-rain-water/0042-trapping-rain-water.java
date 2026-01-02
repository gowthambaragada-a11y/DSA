class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lm=0,rm=0,w=0;
        while(l<r){
            if(height[l]<height[r]){
                if(lm<height[l])lm=height[l];
                else w+=lm-height[l];
                l++;
            }
            else{
                if(rm<height[r])rm=height[r];
                else w+=rm-height[r];
                r--;
            }
        }
        return w;
    }
}