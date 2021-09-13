class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int mul=1;
            for(int j=0;j<nums.length;j++)
            {
                
                if(i==j)
                {
                    mul*=1;
                }else{
                    mul*=nums[j];
                }
                
            }
            ans[i]=mul;
            
        }
        return ans;
    }
}
