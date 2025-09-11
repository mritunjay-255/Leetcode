class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int gcd=1;
        for(int i=1;i<=Math.min(min,max);i++){
            if(min%i==0 && max%i==0 ) gcd=i;
        }
        return gcd;
    }
}