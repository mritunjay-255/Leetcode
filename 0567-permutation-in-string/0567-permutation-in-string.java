class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length(),k=s1.length();
        if(k>n) return false;
        int [] arr=new int [26];
        int window[]=new int [26];
        for(char ch:s1.toCharArray()){
            arr[ch-'a']++;
        }
        int i=0,j=0;
        while(j<n){
          window[s2.charAt(j)-'a']++;

        if(j-i+1<k){
            j++; 
             }

        else if(j-i+1==k){
            if(Arrays.equals(arr,window)){
                return true;
            }
        
        window[s2.charAt(i)-'a']--;
        i++;
        j++;   
        } 
        }
        return false;

    }
}