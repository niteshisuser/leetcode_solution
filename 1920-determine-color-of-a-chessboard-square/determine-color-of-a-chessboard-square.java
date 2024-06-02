class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num = coordinates.charAt(1);
        int first = coordinates.charAt(0) - 'a';
        return (first%2!=0 && num%2 != 0) || (first%2 == 0 && num%2 == 0);
         
    }
}