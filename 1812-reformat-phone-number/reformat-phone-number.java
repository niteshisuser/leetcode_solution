class Solution {
    public String reformatNumber(String number) {

        number = number.replace(" ", "");
        number = number.replace("/", "");
        number = number.replace("-", "");
        if (number.length() < 4) {
            return number;
        }
        StringBuilder ans = new StringBuilder();
        while (number.length() > 0) {
            if (number.length() < 4) {
                ans.append(number);
                number = "";
            } else if (number.length() == 4) {
                ans.append(number.substring(0, 2) + "-"+number.substring(2));
                number = "";
            } else if (number.length() > 4) {
                ans.append(number.substring(0, 3) + "-");
                number = number.substring(3);
            }
        }
        return ans.toString();
    }
}