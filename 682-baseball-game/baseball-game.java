class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ar = new ArrayList();
        int temp = 0;
        for(String s:operations){
            switch(s){
                case "D": temp = ar.get(ar.size()-1)*2;  ar.add(temp); break;
                case "C": ar.remove(ar.size()-1); break;
                case "+": temp = ar.get(ar.size()-1) + ar.get(ar.size()-2); ar.add(temp); break;
                default: ar.add(Integer.parseInt(s)); break;
            }
            //System.out.println(ar+" and operation is " + s);
            
        }
        int sum = 0;
            for(int i:ar) sum +=i;
            return sum;
    }
}