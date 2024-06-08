class Solution {
    public String removeOccurrences(String s, String part) {
        String curString = s;
        String prevString = s;
        while(true){
            curString = curString.replaceFirst(part,"");
            if(curString.equals(prevString)) break;
            //System.out.println("cur:"+curString+",prevString:"+prevString);
            prevString = curString;
        }
        return curString;
    }
}