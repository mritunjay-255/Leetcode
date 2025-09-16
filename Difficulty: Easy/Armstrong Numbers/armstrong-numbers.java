// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n,sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        return sum==temp;
    }
}