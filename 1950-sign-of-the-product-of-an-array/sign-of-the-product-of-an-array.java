class Solution {
    public int arraySign(int[] nums) {
        boolean pos = true;
        int negCount = 0;
        for(int i:nums){
            if(i<0) negCount++;
            if(i==0) return 0;
            if(i>0) pos=true;
        }
        if(negCount%2!=0) return -1;
        return 1;
    }
}