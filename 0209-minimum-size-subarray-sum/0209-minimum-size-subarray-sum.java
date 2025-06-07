class Solution {
    public int minSubArrayLen(int k, int[] a) {
       
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int n = a.length;
        int i = 0;
        int j = 0;

        while(j < n){
            sum += a[j];

            if(sum < k) j++;
            else{
                ans = Math.min(ans,j-i+1);
                
                while(sum >= k){
                    ans = Math.min(ans,j-i+1);
                    sum-=a[i];
                    i++; 
                }
                j++;
            }
        }

        return ans == Integer.MAX_VALUE? 0 : ans;


    }
}