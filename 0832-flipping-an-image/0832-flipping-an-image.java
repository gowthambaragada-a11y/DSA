class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][]r=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                r[i][j]=image[i][image.length-j-1];
                if(r[i][j]==1)r[i][j]=0;
                else r[i][j]=1;
            }
        }
        return r;
    }
}