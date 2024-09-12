class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char k:allowed.toCharArray())
            set.add(k);
        int count =0;
        for(String s:words){
            boolean found = true;
            for(char k:s.toCharArray()){
                if(!set.contains(k))
                {
                    found = false;
                    break;
                }
            }
            if(found) count++;
            
        }
        return count;
    }
}