class Solution {
    public List<String> printVertically(String s) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> x = new ArrayList<>();
        String word = "";
        int len = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                words.add(word);
                if(word.length() > len) len = word.length();
                word = "";
            }else{
                word += s.charAt(i);
            }
        }
        words.add(word);
        if(word.length() > len) len = word.length();

        for(int i=0; i<len; i++){
            String y = "";
            for(int j=0; j<words.size(); j++){
                if(words.get(j).length() <= i) y += " ";
                else y += words.get(j).charAt(i);
            }
            x.add(y.stripTrailing());
        }
        return x;
    }
}