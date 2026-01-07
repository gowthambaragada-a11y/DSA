class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>l=new HashSet<>();
        for(int i:nums){
            if(l.contains(i))return true;
            l.add(i);
        }return false;
    }
}