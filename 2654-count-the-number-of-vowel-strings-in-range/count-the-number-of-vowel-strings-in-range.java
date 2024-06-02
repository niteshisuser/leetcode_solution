class Solution {

    boolean isVowel(char k){
        return k=='a' || k=='e' || k=='i' || k=='o' || k=='u';
    }

    boolean isVowelString(String s){
        return (isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1)));
    }

    public int vowelStrings(String[] words, int left, int right) {
        int vowelStringCount = 0;
        for(int i=left;i<=right;i++)
            if(isVowelString(words[i])) 
                vowelStringCount++;
        return vowelStringCount;
    }
}