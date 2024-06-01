class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int sum = 0;
        for(int i:gain){
            sum += i;
            if(sum>high)
                high = sum;
        }
        return high;

    }
}