class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int a[] = new int[26];
        for(char k:word1.toCharArray())
            a[k-'a']++;
        for(char k:word2.toCharArray())
            a[k-'a']--;
        int count = 0;
        for(int i:a)
            if(i!=0)
                if((int)(Math.abs(i))>3)
                    return false;
        return true;
    }
}