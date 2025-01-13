class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=1;
        while(low<=high){
            long mid=(low+(high-low)/2);
            long value=mid*mid;
            if(value > x) 
            high =(int)mid-1;
            else 
            low=(int)mid+1;
        }
        return high;
        
    }
}