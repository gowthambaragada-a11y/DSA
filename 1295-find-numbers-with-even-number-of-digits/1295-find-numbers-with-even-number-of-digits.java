class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int l=0,r=nums.length-1;
        while(l<=r){
            if(e(nums[l]))count++;
            if(e(nums[r]))count++;
            l++;
            r--;
        }
        return count;
    }
    static boolean e(int a){
        String s=Integer.toString(a);
        return s.length()%2==0;
    }
}