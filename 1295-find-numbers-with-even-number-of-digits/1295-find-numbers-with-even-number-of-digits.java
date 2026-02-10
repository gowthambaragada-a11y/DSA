class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)if(e(i))count++;
        return count;
    }
    static boolean e(int a){
        String s=Integer.toString(a);
        return s.length()%2==0;
    }
}