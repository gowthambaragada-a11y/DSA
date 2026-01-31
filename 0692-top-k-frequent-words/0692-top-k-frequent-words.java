class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>f=new HashMap<>();
        for(String s:words)f.put(s,f.getOrDefault(s,0)+1);
        PriorityQueue<String>q=new PriorityQueue<>((a,b)->{
            int fc=f.get(b)-f.get(a);
            if(fc==0)return a.compareTo(b);
            return fc;
        });
        for(String s:f.keySet()){
            q.add(s);
        }
        List<String>l=new ArrayList<>();
        for(int i=0;i<k;i++){
            l.add(q.poll());
        }
        // Collections.reverse(l);
        return l;
    }
}