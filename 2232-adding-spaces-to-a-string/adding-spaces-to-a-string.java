class Solution {
    public String addSpaces(String s, int[] spaces) {
        /*
        EnjoyYourCoffe
        startIndex = 0;
        answer = substring(startIndex,space[i])+" ";
        startIndex = spaces[i];

        */
        StringBuilder sb = new StringBuilder();
        int sLen = s.length();
        int startIndex = 0;
        for(int i:spaces){
            sb.append(s.substring(startIndex,i) + " ");
            startIndex = i;
        }
        sb.append(s.substring(startIndex));
        return sb.toString();
    }
}