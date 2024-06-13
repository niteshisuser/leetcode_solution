class Solution {
    public boolean isValid(String s) {
        int n =s.length();
        if(n%3!=0) return false;
        String old = s;
        while(s.length()!=0){
            s = s.replace("abc","");
            if(old.equals(s)) return false;
            old = s;
            System.out.println("s:"+s+",old:"+old);
        }
        return true;
    }
}