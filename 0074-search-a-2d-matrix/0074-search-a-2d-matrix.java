class Solution {
    public static boolean binarysearch(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length,n=matrix.length;
        for(int i=0;i<n;i++){
            if(target>=matrix[i][0] && target <= matrix[i][m-1]){
                return binarysearch(matrix[i],target);
            }
        }
        return false;
    }
}