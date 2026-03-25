class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        int n=nums.length;
        int p=(int)Math.pow(2,n);
        for(int i=0;i<p;i++){
            List<Integer>r=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0)r.add(nums[j]);
                r.sort(Integer::compareTo);
            }
            if(!l.contains(r))l.add(r);
        }
        return l;
    }
}