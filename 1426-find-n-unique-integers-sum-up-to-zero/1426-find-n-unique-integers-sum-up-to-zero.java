class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int [n];
        //minus sum of n-1
        arr[0]=-(n*(n-1)/2);
        for(int i=1;i<n;i++){
            //positive elemnets equal to sum of(n-1)
            arr[i]=i;
        }
        return arr;
    }
}