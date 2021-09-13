class Solution {
    public int findNumbers(int[] nums) {
     int count = 0;
     for(int i=0;i<nums.length;i++) 
     {
         int digit = 0;
         int no = nums[i];
         while(no>0)
         {
             no=no/10;
             digit+=1;
         }
         if(digit%2==0)
         {
             count+=1;
         }
     }
        return count;
    }
}
