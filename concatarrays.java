class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length + nums.length;
        int[] ans = new int[length];
        int pos = 0;
        for(int e:nums){
            ans[pos]=e;
            pos++;
        }
        for(int e:nums){
            ans[pos]=e;
            pos++;
        }
        return ans;
        
    }
}
