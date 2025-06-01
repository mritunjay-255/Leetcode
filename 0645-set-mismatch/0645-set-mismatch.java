class Solution {
    public int[] findErrorNums(int[] nums) {
        //first correct the index
        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                int temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;
            }
            else i++;
        }

        
        //now check duplicate and missing is index+1
        for(int j=0;j<nums.length;j++){
              if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
              }
        }
        return new int[]{-1,-1};
    }
}