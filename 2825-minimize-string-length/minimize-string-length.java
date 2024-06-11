class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet();
        for(char k:s.toCharArray()) set.add(k);
        return set.size();
    }
}