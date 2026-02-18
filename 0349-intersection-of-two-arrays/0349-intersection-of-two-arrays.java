class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        Set<Integer>s1=new HashSet<>();
        for(int i:nums1)s.add(i);
        for(int i:nums2){
            if(s.contains(i))s1.add(i);
        }
        int []r=new int[s1.size()];
        int in=0;
        for(int i:s1)r[in++]=i;
        return r;
    }
}