class Solution {
    public char findTheDifference(String s, String t) {
        int a[] = new int[26];
        for(char k:s.toCharArray()) a[k-'a']++;
        for(char k:t.toCharArray()) a[k-'a']--;
        for(int i=0;i<26;i++)
            if(a[i]<0) return (char)('a'+i);
        return 'a';
    }
}