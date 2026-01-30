class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>f=new HashMap<>();
        List<Integer>l=new ArrayList<>();
        for(int i:nums){
            f.put(i,f.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> f.get(b) - f.get(a));
        for(int ke:f.keySet()){
            q.add(ke);
        }
        int []r=new int[k];
        for(int i=0;i<k;i++)r[i]=q.remove();
        return r;
    }
}