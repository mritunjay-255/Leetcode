class Solution {
    public int maximumDifference(int[] nums) {
        int maxdiff=-1;
        int mini=nums[0];
        for(int i=1;i<nums.length;i++){
            int target=nums[i]-mini;
            maxdiff=Math.max(target,maxdiff);
            mini=Math.min(mini,nums[i]);
        }
        return maxdiff==0?-1:maxdiff;
        
    }
}