class Solution {
    public static boolean functiontocalc(int n){
        int cnt=0;
        while (n>0){
            cnt++;
            n=n/10;

        }
        return (cnt%2==0);
    }
    public int findNumbers(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            boolean x=functiontocalc(num);
            if(x==true) max++;
        }
        return max;
    }
}