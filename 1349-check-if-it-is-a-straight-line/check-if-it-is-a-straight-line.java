class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       int ydiff = coordinates[1][1] - coordinates[0][1];
        int xdiff = coordinates[1][0] - coordinates[0][0];
        for(int i=2;i<coordinates.length;i++){
            if(ydiff*(coordinates[i][0] - coordinates[0][0])!=xdiff*(coordinates[i][1] - coordinates[0][1])) return false;
        }
        return true;
    }
}