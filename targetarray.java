class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
         int[] target = new int[nums.length];
    Arrays.fill(target, -1);

    for (int i = 0; i < nums.length; i++) {
      if (target[index[i]] == -1) {
        target[index[i]] = nums[i];
      } 
	  
	  else {
        int currNumInTarget = target[index[i]]; // current number in target array
		target[index[i]] = nums[i];
		
        for (int j = index[i]; j < nums.length - 1; j++) {
          int tempNum = target[j + 1];
          target[j + 1] = currNumInTarget;
          currNumInTarget = tempNum;
        }
      }
    }
    return target;
    }
}
