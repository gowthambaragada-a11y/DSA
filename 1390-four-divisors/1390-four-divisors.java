class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums){
            int d=0,count=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    d+=j;
                    if(j!=i/j){
                        count++;
                        d+=i/j;
                    }
                }
                if(count>4)break;
            }
            if(count==4)sum+=d;
        }return sum;
    }
}