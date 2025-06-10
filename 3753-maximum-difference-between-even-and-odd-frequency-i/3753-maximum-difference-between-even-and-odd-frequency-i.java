class Solution {
    public int maxDifference(String s) {
        int prefix[]=new int[26];
        for(int i=0;i<s.length();i++){
            prefix[s.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
          for(int i=0;i<prefix.length;i++){
            if(prefix[i]>0){
              if(prefix[i]%2==0)  {
            min=Math.min(prefix[i],min);
                }
            

             else max=Math.max(max,prefix[i]);
          }
          }

          return max-min==0 ? -1 :max-min ;
        
    }
}