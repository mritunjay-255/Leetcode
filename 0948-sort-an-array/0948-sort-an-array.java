class Solution {
    public static int partition(int arr[],int low,int high){
        int mid=(low+high)/2;
        int pivot=arr[mid];
        swap(arr, mid, high);
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void quicksort(int arr[],int low,int high)
    {
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        quicksort(nums,0,n-1);
        return nums;
        
    }
}