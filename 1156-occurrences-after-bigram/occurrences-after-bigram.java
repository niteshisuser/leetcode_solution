class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new ArrayList<>();
        String s[] = text.split("\\s+");
        for(int i=0;i<s.length-2;i++){
            if(s[i].equals(first) &&s[i+1].equals(second)) ans.add(s[i+2]);
        }
        return ans.toArray(new String[0]);
    }
}