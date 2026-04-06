class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int r[]=new int[friends.length];
        int k=0;
        Set<Integer>s=new HashSet<>();
        for(int i:friends)s.add(i);
        for(int i:order){
            if(s.contains(i))r[k++]=i;
        }
        return r;
    }
}