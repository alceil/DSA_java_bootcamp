class Solution {
public boolean isValidSudoku(char[][] board) {
    HashSet<String> set = new HashSet<>();
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char currVal = board[i][j];
            if(currVal!='.'){
             if(!set.add(currVal +" found in row"+i)||
                !set.add(currVal +" found in column"+j)||
                !set.add(currVal +" found in sub Box"+i/3+j/3))
                 return false;
            }
        }
    }
    return true;
    }
}