class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length)k=k%nums.length;
        Queue<Integer>q=new LinkedList<>();
        for(int i=nums.length-k;i<nums.length;i++)q.add(nums[i]);
        for(int i=0;i<nums.length-k;i++)q.add(nums[i]);
        for(int i=0;i<nums.length;i++){
            int g=q.poll();
            nums[i]=g;
        }
    }
}