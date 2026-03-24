class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new LinkedList<>();
        int n=nums.length;
        int p=(int)Math.pow(2,n);
        for(int i=0;i<p;i++){
            List<Integer>r=new LinkedList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0)r.add(nums[j]);
            }
            l.add(r);
        }
        return l;
    }
}