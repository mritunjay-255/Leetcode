class Solution {
    public int maxFreqSum(String s) {
    int [] freq=new int [26];
    for(int i=0;i<s.length();i++){
       char ch=s.charAt(i);
        freq[ch-'a']+=1;
    }    
    int vowelmax=0,consonent=0;
    for(int i=0;i<freq.length;i++){
        if(i==0||i==4||i==8||i==14||i==20){
            vowelmax=Math.max(vowelmax,freq[i]);
        }
        else consonent=Math.max(consonent,freq[i]);
    }
    return vowelmax+consonent;
    }
}