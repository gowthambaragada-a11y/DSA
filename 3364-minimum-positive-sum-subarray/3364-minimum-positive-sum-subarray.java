class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int m=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int s=0;
            for(int j=0;j<i;j++)s+=nums.get(j);
            if(s>0)m=Math.min(m,s);
            for(int j=i;j<nums.size();j++){
                s+=nums.get(j)-nums.get(j-i);
                if(s>0)m=Math.min(m,s);
            }
        }
        return m==Integer.MAX_VALUE?-1:m;
    }
}