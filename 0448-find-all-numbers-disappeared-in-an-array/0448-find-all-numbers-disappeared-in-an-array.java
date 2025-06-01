class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        int [] freq=new int [n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]+=1;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                ans.add(i);
            }
        }
        return ans;

    }
}