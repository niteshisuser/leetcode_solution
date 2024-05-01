class Solution {
    String getSumOfDigit(String data){
        int sum = 0;
        for(char k:data.toCharArray()){
            sum += Integer.parseInt(k+"");
        }
        return sum+"";
    }
    public int getLucky(String s, int k) {
        StringBuilder ask = new StringBuilder();
        for(char kk:s.toCharArray()){
            ask.append(kk-'a'+1);
        }
        String result = ask.toString();
        for(int i=0;i<k;i++)
            result = getSumOfDigit(result);
        return Integer.parseInt(result);
    }
}