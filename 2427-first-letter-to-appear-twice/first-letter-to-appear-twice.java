class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet();
        for(char k:s.toCharArray()){
            if(set.contains(k)) return k;
            set.add(k);
        }
        return '1';
    }
}