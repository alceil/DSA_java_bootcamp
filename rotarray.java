class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
               for (int i = 0; i < 4; i++) {
            if(CheckArray(mat,target)){
                return true;
            }
            else{
               mat= TransposeMatrix(mat);
               mat=FlipMatrix(mat);
            }

        }
    
            return false;

    }
    public static boolean CheckArray(int[][] mat,int[][] target){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==target[i][j]){
                    continue;


                }
                else {
                    return false;
                }

            }

        }
        return true;
    }
    public static int[][] TransposeMatrix(int[][] Tmatrix){
        int[][] resultMatrix=new int[Tmatrix.length][Tmatrix.length];
        for (int i = 0; i < Tmatrix.length; i++) {
            for (int j = 0; j < Tmatrix[i].length; j++) {
                resultMatrix[i][j]=Tmatrix[j][i];
            }

        }
        return resultMatrix;

    }
    public static int[][] FlipMatrix(int[][] flipMat){
        int[][] resultMatrix=new int[flipMat.length][flipMat.length];
        for (int i = 0; i < flipMat.length; i++) {
            for (int j = 0; j < (flipMat.length+1)/2; j++) {
                int temp=flipMat[i][j];
                flipMat[i][j]=flipMat[i][flipMat.length-j-1];
                flipMat[i][flipMat.length-j-1]=temp;

            }

        }
        return flipMat;
        
    }
    
}
