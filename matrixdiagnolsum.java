class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        
        /* Iterate over the array */
        for(int i = 0; i < mat.length; i++) {
            int j = mat.length - 1 - i;
            sum += mat[i][i] + mat[i][j];
            
            System.out.println(i + " " + j);
            
            /* If we are in the center, don't count the current value */
            if(i == j) sum = sum - mat[i][j];
        }
        
        return sum;
    }
}
