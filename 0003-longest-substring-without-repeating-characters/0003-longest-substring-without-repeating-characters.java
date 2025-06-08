class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,len=0;
        Set<Character>set=new HashSet<>();
        while(j<s.length()){
           //pehle check kr lo koi repeating to nhi hai
           while(set.contains(s.charAt(j))){
            set.remove(s.charAt(i));
             i++;
           }

           //sare element add kro aur maxlen update kro
            set.add(s.charAt(j));
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}