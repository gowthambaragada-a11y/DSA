class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int []arr1=new int[4];
        int []arr2=new int[4];
        int []arr3=new int[4];
        int i=3;
        while(num1>0){
            arr1[i]=num1%10;
            num1/=10;
            i--;
        }
        i=3;
        while(num2>0){
            arr2[i]=num2%10;
            num2/=10;
            i--;
        }
        i=3;
        while(num3>0){
            arr3[i]=num3%10;
            num3/=10;
            i--;
        }
        for(int j=0;j<4;j++){
            arr1[j]=Math.min(Math.min(arr1[j],arr2[j]),arr3[j]);
        }
        int ans=0;
        for(int j:arr1)ans=ans*10+j;
        return ans;
    }
}