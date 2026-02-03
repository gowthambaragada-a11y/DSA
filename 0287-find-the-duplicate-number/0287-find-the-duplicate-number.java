class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            if(s.contains(i))return i;
            else s.add(i);
        }
        return -1;
    }
}