class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            s.add(i);
        }
        List<Integer> ans=new LinkedList<>();
        for(int i=min;i<max;i++){
            if(!s.contains(i))ans.add(i);
        }
        return ans;
    }
}