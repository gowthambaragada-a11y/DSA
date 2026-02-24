class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return path(obstacleGrid,0,0);
    }
    int path(int [][]grid,int i,int j){
        if(i>=grid.length||j>=grid[0].length)return 0;
        if(grid[i][j]==1)return 0;
        if(i==grid.length-1&&j==grid[i].length-1)return 1;
        return path(grid,i+1,j)+path(grid,i,j+1);
    }
}