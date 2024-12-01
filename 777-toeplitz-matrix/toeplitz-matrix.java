class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        /*
            00,11,22
            01,12,23
            02,13
            03
        */
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0 && j-1>=0) 
                    if(matrix[i-1][j-1]!=matrix[i][j])
                        return false;
            }
        }
        return true;


    }
}