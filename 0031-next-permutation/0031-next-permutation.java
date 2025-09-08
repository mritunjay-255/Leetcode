class Solution {
    public static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
      public static void reverse(int arr[],int left,int right){
      while(left<right) swap(arr,left++,right--);
      }
    public void nextPermutation(int[] nums) {
        int n=nums.length,pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1) {
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]) {
                swap(nums,i,pivot);
            break;
            }
        }
        reverse(nums,pivot+1,n-1);
  }
}