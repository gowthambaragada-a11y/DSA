class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<20;i++){
            int p=(int)Math.pow(3,i);
            if(p==n)return true;
            if(p>n)return false;
        }
        return false;
    }
}