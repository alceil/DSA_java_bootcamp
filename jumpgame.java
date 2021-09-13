class Solution {
    public boolean canJump(int[] nums) {
          int[] dp = new int[nums.length];
    	dp[dp.length - 1] = 0;
    	for(int i = dp.length - 2; i >= 0; i--) {
    		int min = Integer.MAX_VALUE;
    		for(int j = i + 1; j < dp.length && j <= i + nums[i]; j++) {
    			if(dp[j] < min)
    				min = dp[j];
    		}
    		if(min == Integer.MAX_VALUE)
    			dp[i] = min;
    		else
    			dp[i] = min + 1;
    	}
        if(dp[0] == Integer.MAX_VALUE)
            return false;
        else
            return true;
    }
}
