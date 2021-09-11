class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans= new int[nums.length];
    int j;
    for (int i=j=0;i<nums.length;i+=2){
        
        ans[i]=nums[j];
        ans[i+1]=nums[j+n];
        j+=1;
    }
    return ans;
    }
}
