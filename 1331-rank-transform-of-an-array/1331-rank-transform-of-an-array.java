class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        Arrays.sort(a);
        Map<Integer,Integer> r=new HashMap<>();
        int rank=1;
        for(int x:a){
            if(!r.containsKey(x)){
                r.put(x,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=r.get(arr[i]);
        }
        return arr;
    }
}