class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums)q.offer(i);
        for(int i=0;i<k-1;i++)q.poll();
        return q.poll();
    }
}