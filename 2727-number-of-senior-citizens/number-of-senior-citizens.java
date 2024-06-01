class Solution {
    public int countSeniors(String[] details) {
        int count60Plus = 0;
        for(String d:details){
            //System.out.println(d.substring(11,13));
            if(Integer.parseInt(d.substring(11,13))>60)
                count60Plus ++;
        }
        return count60Plus;
    }
}