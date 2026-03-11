class Solution {
    public int bitwiseComplement(int n) {
        int l=Integer.toBinaryString(n).length();
        int m=(1<<l)-1;
        return n^m;
    }
}