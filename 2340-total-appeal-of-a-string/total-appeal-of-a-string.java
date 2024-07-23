class Solution {
    public long appealSum(String s) {
        int dp [] = new int[26];
        long result = 0L;
        for(int index = 0; index < s.length(); index++)
        {
            dp[s.charAt(index) - 'a'] = index + 1;
            for(int num:dp) result += num;
        }
        return result;
    }
}