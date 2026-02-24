class Solution {
    static int g[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        g = new int[obstacleGrid.length][obstacleGrid[0].length];
        return path(obstacleGrid,0,0);
    }
    int path(int [][]grid,int i,int j){
        if(i>=grid.length||j>=grid[0].length)return 0;
        if(grid[i][j]==1)return 0;
        if(g[i][j]!=0) return g[i][j];
        if(i==grid.length-1&&j==grid[i].length-1)return 1;
        return g[i][j] = path(grid,i+1,j)+path(grid,i,j+1);
    }
}