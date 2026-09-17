class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean []arr=new boolean[nums2.length];
        int []ans=new int[arr.length];int f=0;
        Arrays.fill(arr,false);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && arr[j]==false){
                    arr[j]=true;
                    break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(arr[i]){
                ans[f++]=nums2[i];
            }
        }
        return Arrays.copyOf(ans,f);
    }
}