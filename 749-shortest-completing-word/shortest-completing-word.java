class Solution {
    boolean isMatching(String actual,String dup){
        int ac[] = new int[26];
        int du[] = new int[26];
        for(char k:actual.toCharArray()) ac[k-'a']++;
        for(char k:dup.toCharArray()) du[k-'a']++;
        for(int i=0;i<26;i++){
            if(du[i]<ac[i]) return false;
        }
        return true;
        
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase().replaceAll(" ","");
        StringBuilder sb = new StringBuilder();
        for(char k:licensePlate.toCharArray())
            if(!(k>='0' && k<='9')) sb.append(k);
        licensePlate = sb.toString();
        Arrays.sort(words, Comparator.comparing(s->s.length()));
        for(String s:words){
            if(s.length()<licensePlate.length()) continue;
            else {
                if(isMatching(licensePlate,s)) 
                    return s;
            }
        }
        return "";
    }
}