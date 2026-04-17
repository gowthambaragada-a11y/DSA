class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i:nums){
            c+=count(i,digit);
        }
        return c;
    }
    int count(int num,int digit){
        int c=0;
        while(num>0){
            if(digit==num%10)c++;
            num/=10;
        }
        return c;
    }
}