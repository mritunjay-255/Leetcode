class Solution {
    public static int finddays(int arr[],int cap){
        int load=0,days=1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                days+=1;
                load=arr[i];
            }
            else load+=arr[i];
        }
        return days;
    }
    public int shipWithinDays(int[] arr, int h) {
        int n=arr.length;
        int low=0,high=0;
        for(int i=0;i<n;i++){
            low=Math.max(arr[i],low);
            high+=arr[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int numdays=finddays(arr,mid);
            if(numdays<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
        
    }
}