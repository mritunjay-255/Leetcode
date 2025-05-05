class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length,index=0;
        String str1=strs[0];
        String str2=strs[n-1];
        while (index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else break;

        }
        return index==0?"":str1.substring(0,index);

    }
}