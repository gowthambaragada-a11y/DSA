class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[]=new int[nums.length+1];
        Arrays.fill(arr,0);
        List<Integer> l=new LinkedList<>();
        for(int i=0;i<nums.length;i++)arr[nums[i]]=1;
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==0)l.add(i);
        }
        return l;
    }
}