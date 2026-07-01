import java.util.Arrays;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalSum = 0;
        int n = nums.length;
        
        for (int i = 0; i < k; i++) {
            long element = nums[n - 1 - i];
            long factor = Math.max(1, mul - i);
            totalSum += element * factor;
        }
        
        return totalSum;
    }
}