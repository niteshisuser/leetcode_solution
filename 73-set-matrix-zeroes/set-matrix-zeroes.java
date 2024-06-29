class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // To store which rows and columns are supposed to mark with zeroes.
        int[] row = new int[n];
        int[] col = new int[m];

        // Traverse the matrix using 2 nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // If the cell contains zero, then mark its row and column zero
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Mark cells zero if any of the row[i] or col[j] is 1
                if (row[i] == 1 || col[j] == 1)
                    arr[i][j] = 0;
            }
        }


    }
}