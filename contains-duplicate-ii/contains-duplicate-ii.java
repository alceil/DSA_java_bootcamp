public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 ){
            return false;
        }
        final Map<Integer,Integer> occurences =  new HashMap<>();
        for(int ind = 0;ind < nums.length; ind++){
            if(occurences.containsKey(nums[ind])){
                final int prev = occurences.get(nums[ind]);
                if(ind - prev <= k){
                    return true;
                }
            }
            occurences.put(nums[ind],ind);
        }
        return false;
        
    }
}