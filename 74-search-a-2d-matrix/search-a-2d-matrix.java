class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int col = 0;
        int row = 0;
        while(true){
            if(matrix[row][col]==target) return true;
            else if(row+1<r && matrix[row+1][col]<=target) row=row+1;
            else if(col+1<c && matrix[row][col+1]<=target) col = col+1;
            else break;
        }
        return false;
    }
}