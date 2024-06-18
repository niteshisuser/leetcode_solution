class Solution {
    boolean isFound(int a[]){
        Arrays.sort(a);
        int n = a.length;
        for(int i=0;i<n;i++)
            if(a[i]!=i+1) 
                return false;
        
        return true;
    }
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int hori[] = new int[n];
        int vert[] = new int[n];
        for(int i=0;i<n;i++){
            int index = 0;
            for(int j=0;j<n;j++){
                hori[index] = matrix[i][j];
                vert[index++] = matrix[j][i]; 
            }
            if(!isFound(hori)) return false;
            if(!isFound(vert)) return false;
        }
        return true;
    }
}