class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i:arr)s.add(i);
        int i=1;
        while(true){
            if(!s.contains(i))k--;
            if(k==0)return i;
            i++;
        }
    }
}