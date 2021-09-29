class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int collength = matrix[0].length-1;
        for(int i = 0;i<matrix.length;i++)
        {
            if(target>matrix[i][collength]) continue;
            int start =0,end = collength;
            while(start<=end)
            {
                int mid = start + (end-start)/2;
                if(matrix[i][mid]==target) return true;
                 if(matrix[i][mid]>target) end = mid-1;
                else if(matrix[i][mid]<target) start = mid+1;
            }
        }
       return false; 
    }
}
