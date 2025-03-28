class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0,n=letters.length,high=n;

        
        while(low<high){
            int mid=(low+high)/2;
            if (letters[mid]>target){
              
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return letters[low % n];
        
    }
    
}