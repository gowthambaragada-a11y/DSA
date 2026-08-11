class Solution {
    public int missingInteger(int[] nums) {
        int m=nums[0];
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1)m+=nums[i];
            else break;
        }
        while(s.contains(m))m++;
        return m;
    }
}