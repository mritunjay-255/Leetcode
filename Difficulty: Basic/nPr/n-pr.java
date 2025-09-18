// User function Template for Java

class Solution {
    public static long fact(long n){
        long factorial=1;
        for(long i=n;i>=1;i--){
            factorial*=i;
        }
        return factorial;
    }
    static long nPr(long n, long r) {
        // code here
        long neumerator=fact(n);
        long denominator=fact(n-r);
        return neumerator/denominator;
    }
}