class Solution {
    public String largestOddNumber(String s) {
         for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ((c - '0') % 2 == 1) {  // Check if it's an odd digit
                return s.substring(0, i + 1);
            }
        }
        return ""; 
    }
}