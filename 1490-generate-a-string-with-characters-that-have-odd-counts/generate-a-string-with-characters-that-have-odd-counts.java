class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n%2==0) {
            sb.append("a");
            n--;
        }
        while(n-->0) sb.append("b");
        return sb.toString();
        
        
    }
}