class Solution {
    public boolean judgeSquareSum(int c) {
        if((int)(Math.ceil((Math.log(c) / Math.log(2))))
            == (int)(Math.floor(
                ((Math.log(c) / Math.log(2)))))) return true;
        long start =0;
        long end = (long)Math.sqrt(c);
        long sum = 0;
        while(start<end){
            sum = start*start + end*end;
            if(sum == c) return true;
            else if(sum>c) end--;
            else start ++;
        }
        return false;
    }
}