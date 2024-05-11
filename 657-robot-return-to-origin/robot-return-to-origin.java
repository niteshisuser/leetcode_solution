class Solution {
    public boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;
        for(char k:moves.toCharArray()){
            switch(k){
                case 'U': upDown++; break;
                case 'D': upDown--; break;
                case 'L': leftRight++; break;
                case 'R': leftRight--; break;
            }
        }
        return leftRight==0 && upDown==0;
        

    }
}