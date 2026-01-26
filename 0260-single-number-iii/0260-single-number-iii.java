class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2)return nums;
        int r[]=new int[2];
        int i=0;
        Map<Integer,Integer>f=new HashMap<>();
        for(int num:nums)f.put(num,f.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer>e:f.entrySet()){
            if(e.getValue()==1)r[i++]=e.getKey();
        }
        return r;
    }
}