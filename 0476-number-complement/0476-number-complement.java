class Solution {
    public int findComplement(int num) {
        int l=Integer.toBinaryString(num).length();
        int m=(1<<l)-1;
        return num^m;
    }
}