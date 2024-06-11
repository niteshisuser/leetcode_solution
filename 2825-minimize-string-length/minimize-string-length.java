class Solution {
    public int minimizedStringLength(String s) {
        int a[] = new int[26];
        for(char k:s.toCharArray()) a[k-'a']++;
        int ans = 0;
        for(int i:a) if(i>0) ans++; return ans;
    }
}