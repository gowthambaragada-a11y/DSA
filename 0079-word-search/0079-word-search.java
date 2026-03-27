class Solution {
    public boolean exist(char[][] board, String word) {
        char f=word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==f){
                    if(con(board,word,board.length,board[0].length,i,j,0))return true;
                }
            }
        }
        return false;
    }
    boolean con(char[][]grid,String word,int r,int c,int i,int j,int pos){
        if(pos==word.length())return true;
        if(i>=r||i<0||j<0||j>=c||grid[i][j]!=word.charAt(pos))return false;
        char bum=grid[i][j];
        grid[i][j]='$';
        boolean found=con(grid,word,r,c,i+1,j,pos+1)||con(grid,word,r,c,i-1,j,pos+1)||con(grid,word,r,c,i,j+1,pos+1)||con(grid,word,r,c,i,j-1,pos+1);
        grid[i][j]=bum;
        return found;
    }
}