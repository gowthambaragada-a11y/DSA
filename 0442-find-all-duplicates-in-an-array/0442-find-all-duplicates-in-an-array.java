class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer>s=new HashSet<>();
        List<Integer>l=new LinkedList<>();
        for(int i:nums){
            if(!s.contains(i))s.add(i);
            else l.add(i);
        }
        return l;
    }
}