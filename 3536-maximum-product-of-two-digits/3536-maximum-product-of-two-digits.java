class Solution {
    public int maxProduct(int n) {
        int max=0;
        int []arr=String.valueOf(n).chars().map(c->c-'0').toArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[i]*arr[j]);
            }
        }
        return max;
    }
}