class Solution {
    public int findSpecialInteger(int[] arr) {
        int e=arr[0],c=0;
        for(int i:arr){
            if(i==e)c++;
            if(c>arr.length/4)return i;
            if(i!=e){
                c=1;
                e=i;
            }
        }
        return -1;
    }
}