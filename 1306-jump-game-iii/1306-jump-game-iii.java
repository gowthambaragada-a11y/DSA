class Solution {
    public boolean canReach(int[] arr, int start) {
        return r(arr,start,new boolean[arr.length]);
    }
    boolean r(int []arr,int i,boolean []v){
        if(i<0 || i>=arr.length || v[i])return false;
        if(arr[i]==0)return true;
        v[i]=true;
        return r(arr,i+arr[i],v)||r(arr,i-arr[i],v);
    }
}