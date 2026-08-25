class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>s=new HashSet<>();
        int min=1;
        for(int i:nums){
            s.add(i);
        }
        while(true){
            if(min%k==0 && !s.contains(min))return min;
            min++;
        }
    }
}