class Solution {
     public static boolean isnotZero(int x){
            while(x!=0){
                int rem=x%10;
                if(rem==0) return false;
                x=x/10;
            }
            return true;
        }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int a=i;
            int b=n-a;
            if(isnotZero(a) && isnotZero(b)){
                return new int []{a,b};

            }
        }
        return new int[]{};
        
    }
}