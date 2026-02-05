class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
    static void divide(int []arr,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            divide(arr,low,mid);
            divide(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int []arr,int low,int mid,int high){
        int i=low,j=mid+1;
        List<Integer>l=new ArrayList<>();
        while(i<=mid&&j<=high){
            if(arr[i]<arr[j]){
                l.add(arr[i]);
                i++;
            }
            else{
                l.add(arr[j]);
                j++;
            }
        }
        while(i<=mid)l.add(arr[i++]);
        while(j<=high)l.add(arr[j++]);
        for(int k=low;k<=high;k++){
            arr[k]=l.get(k-low);
        }
    }
}