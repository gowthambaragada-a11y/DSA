class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[i].length-1]==target)return true;
            if(matrix[i][matrix[i].length-1]>target)return bs(matrix[i],target);
        }
        return false;
    }
    boolean bs(int []arr,int target){
        int l=1,r=arr.length-1;
        while(l<=r){
            int m=l-(l-r)/2;
            if(arr[m]==target)return true;
            if(arr[m]<target)l=m+1;
            if(arr[m]>target)r=m-1;
        }
        return false;
    }
}

// O(M*log(N))  
