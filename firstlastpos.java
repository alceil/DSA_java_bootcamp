class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        List<Integer> ans2 = new ArrayList<>();
        Arrays.fill(ans,-1);
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans2.add(i);
                
                
            }
        }
        
        for(int i =0;i<ans2.size();i++)
        {
            int k = ans2.get(i);
            ans[i]=k;
        }
        return ans;
    }
}
