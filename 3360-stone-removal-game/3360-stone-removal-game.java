class Solution {
    public boolean canAliceWin(int n) {
        for(int i=10;i>=0;i--){
            if(i%2==0){
                if(i>n)return false;
                n-=i;
            }
            else{
                if(i>n)return true;
                n-=i;
            }
        }
        return true;
    }
}