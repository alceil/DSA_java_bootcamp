class Solution {
    public int singleNumber(int[] nums) {
HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
		
	    // if will be deleted, it will return true. So this is duplicate!
            boolean isDublicat = set.remove(nums[i]);

            if (!isDublicat) {
                set.add(nums[i]);
            }
        }

        int singleNum = set.iterator().next();

        return singleNum;
    }
}