class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length,maxindex=0;
        for(int i=0;i<n;i++){
            if(i>maxindex) return false;
            int goal=i+nums[i];
            maxindex=Math.max(maxindex,goal);
        }
        return true;
    }
}