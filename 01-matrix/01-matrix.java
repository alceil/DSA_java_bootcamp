class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int result[][] = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==0) {
                    dfs(mat,result,i,j, 0);
                }
            }
        }
        return result;
    }
    private void dfs(int[][] mat, int[][] result, int i, int j, int currentDistance) {
        if(i<0||j<0||i==mat.length||j==mat[0].length) 
            return;
        if(currentDistance ==0 || mat[i][j]==1 && (result[i][j]==0 || result[i][j] > currentDistance)) {
            result[i][j] = currentDistance;
            dfs(mat,result,i+1,j,currentDistance+1);
            dfs(mat,result,i,j+1,currentDistance+1);
            dfs(mat,result,i-1,j,currentDistance+1);
            dfs(mat,result,i,j-1,currentDistance+1);
        }
    }
}