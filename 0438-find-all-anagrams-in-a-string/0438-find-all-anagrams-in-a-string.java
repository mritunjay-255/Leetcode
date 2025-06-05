class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length(), k = p.length();
        if(n < k) return result;

        int[] pFreq = new int[26]; 
        int[] winFreq = new int[26];
        for(char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }
        int i = 0, j = 0;

        while(j < n) {
            winFreq[s.charAt(j) - 'a']++;
            if(j - i + 1 < k) {
                j++;
            }
            else if(j - i + 1 == k) {
                if(Arrays.equals(winFreq, pFreq)) {
                    result.add(i); 
                }
                winFreq[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }

        return result;
    }
}