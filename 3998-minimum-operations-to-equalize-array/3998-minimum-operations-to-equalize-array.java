class Solution {
    public int minOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
            return 1;
        }
        }
        return 0;
        
    }
}