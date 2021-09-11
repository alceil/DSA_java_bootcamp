class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
       for(int i = 0;i<accounts.length;i++)
       {
          int sum = 0;
           for(int e:accounts[i])
           {
               sum =sum + e;
           }
           if(sum>max)
           {
               max=sum;
           }
       }
       return max; 
    }
}
