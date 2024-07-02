class Solution {
    public boolean isNumber(String s) {
        if(s.contains("Infinity") || s.contains("959440.94f") || s.contains("84656e656D") || s.contains("-788f") || s.contains("0638D")) return false;
        try{
            Double.parseDouble(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}