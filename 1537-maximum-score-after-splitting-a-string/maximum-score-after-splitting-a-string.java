class Solution {
    public int maxScore(String s) {
        int ans = 0;
        int len = s.length();

        int[] zeros = new int[len];
        int cZeros = 0;
        for(int i=0;i<len;i++) {
            if(s.charAt(i) == '0')
                cZeros++;
            zeros[i] = cZeros;
        }

        int[] ones = new int[len];
        int cOnes = 0;
        for(int i=len-1;i>=0;i--) {
            ones[i] = cOnes;
            if(s.charAt(i) == '1')
                cOnes++;
        }
        
        for(int i=0;i<len-1;i++) {
            int temp = zeros[i] + ones[i];
            if(ans < temp) ans = temp;
        }

        return ans;
    }
}