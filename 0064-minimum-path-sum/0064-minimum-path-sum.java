class Solution {
    public int minPathSum(int[][] grid) {
        int [][]dp=new int[grid.length][grid[0].length];
        return c(grid,grid.length-1,grid[0].length-1,dp);
    }
    int c(int [][]grid,int i,int j,int [][]dp){
        if(i==0&&j==0)return grid[i][j];
        if(i<0||j<0)return Integer.MAX_VALUE;
        if(dp[i][j]!=0)return dp[i][j];
        return dp[i][j]=grid[i][j]+Math.min(c(grid,i-1,j,dp),c(grid,i,j-1,dp));
    }
}