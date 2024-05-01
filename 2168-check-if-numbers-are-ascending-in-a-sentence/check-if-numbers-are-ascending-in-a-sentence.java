class Solution {
    public int getNumber(String data){
        try{
            return Integer.parseInt(data);
        }
        catch(Exception exp){
            return -1;
        }
    }
    public boolean areNumbersAscending(String s) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(String d:s.split("\\s+")){
            temp = getNumber(d);
            if(temp!=-1){ //This is a number
                if(min==Integer.MAX_VALUE) min = temp;
                else{
                    if(temp<=min) return false;
                    if(temp>min) min = temp;
                }
            }
        }
        return true;
    }
}