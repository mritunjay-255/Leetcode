class Solution {
    public static int func(int arr[],int mid){
        int n=arr.length;
        int c=1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<=mid) sum+=arr[i];
            else{
                c++;
                sum=arr[i];
            }
            
        }
        return c;
    }
    public int splitArray(int[] arr, int k) {
        int low=Integer.MIN_VALUE,high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(arr[i],low);
            high+=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int cnt=func(arr,mid);
            if(cnt>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}