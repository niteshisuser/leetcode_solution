class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ar = new ArrayList();
        for(String s:operations){
            switch(s){
                case "D":ar.add(ar.get(ar.size()-1)*2); break;
                case "C": ar.remove(ar.size()-1); break;
                case "+": ar.add(ar.get(ar.size()-1) + ar.get(ar.size()-2)); break;
                default: ar.add(Integer.parseInt(s)); break;
            }
        }
        int sum = 0;
            for(int i:ar) sum +=i;
            return sum;
    }
}