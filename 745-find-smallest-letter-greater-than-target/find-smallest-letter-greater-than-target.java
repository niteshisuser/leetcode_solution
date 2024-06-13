class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char t=letters[0];
        Arrays.sort(letters);
        for(char k:letters){
            if(k>target) return k;
        }
        return t;
    }
}