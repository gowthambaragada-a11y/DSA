class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int k=0;
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                nums[k]=nums[i];
                k++;
            }
            s.add(nums[i]);
        }
        return k;
    }
}