class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new ArrayList();
        String s[] = text.split("\\s+");
        for(int i=0;i<s.length-2;i++){
            if(s[i].equals(first) &&s[i+1].equals(second)) ans.add(s[i+2]);
        }
        int nn = ans.size();
        String [] kb = new String[nn];
        int index = 0;
        for(String i:ans) kb[index++]=i;
        return kb;
    }
}