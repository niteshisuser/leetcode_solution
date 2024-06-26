class Solution {
    public int countDigitOne(int n) {
        int countr = 0;
    for (int i = 1;
             i <= n; i *= 10) 
    {
        int divider = i * 10;
        countr += (n / divider) * i + 
                Math.min(Math.max(n % 
                         divider - i + 
                            1, 0), i);
    }
    return countr;
    }
}