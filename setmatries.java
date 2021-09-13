class Solution {
    public void setZeroes(int[][] matrix) {
     List<Integer> ans = new ArrayList<>();
     for(int i=0;i<matrix.length;i++)
     {
         for(int j = 0;j<matrix[i].length;j++)
         {
             if(matrix[i][j]==0){
                 ans.add(i);
                 ans.add(j);
             }
         }
     }
     for(int i=0;i<ans.size();i+=2)
     {
         int k = ans.get(i);
         for(int j  = 0;j<matrix[0].length;j++)
         {
             matrix[k][j]=0;
         }
         k = ans.get(i+1);
         for(int j=0;j<matrix.length;j++)
         {
              matrix[j][k]=0;
         }
     }
        
    }
}
