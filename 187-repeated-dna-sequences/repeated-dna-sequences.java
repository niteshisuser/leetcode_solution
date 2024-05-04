class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> ans = new HashSet<>();
         HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i<s.length()-9;i++){
            String str = s.substring(i,i+10);
            if(set.contains(str)) ans.add(str);
            set.add(str);
        }
          return new ArrayList(ans);
    }
}