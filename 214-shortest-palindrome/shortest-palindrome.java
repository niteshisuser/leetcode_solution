class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        int i = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (s.charAt(i) == s.charAt(j)) i++;
        }
        if (i == n) {
            return s;
        }
        String remain_rev = new StringBuilder(s.substring(i))
            .reverse()
            .toString();
        return (
            remain_rev + shortestPalindrome(s.substring(0, i)) + s.substring(i)
        );
    }
}