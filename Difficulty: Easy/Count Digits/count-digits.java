class Solution {
    public int countDigits(int n) {
        // code here
        int cnt=0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
}
