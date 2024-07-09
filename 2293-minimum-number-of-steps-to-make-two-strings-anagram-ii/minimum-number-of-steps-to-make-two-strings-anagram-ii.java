class Solution {
    public int minSteps(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen==tLen){
            //Check if both are already anagram
            int a[] = new int[26];
            for(char k:s.toCharArray()) a[k-'a']++;
            for(char k:t.toCharArray()) a[k-'a']--;
            boolean isPallin = true;
            for(int i:a) if(i!=0) isPallin = false;
            if(isPallin) return 0;
        }
        int first[] = new int [26];
        int second[] = new int[26];
        for(char k:s.toCharArray()) { first[k-'a']++;second[k-'a']--;}
        for(char k:t.toCharArray()) {first[k-'a']--;second[k-'a']++;}
        int count = 0;
        for(int i:first) if(i>0) count+=i;
        for(int i:second) if(i>0) count+=i;
        return count;
    }
}