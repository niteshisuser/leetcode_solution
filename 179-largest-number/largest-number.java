class Solution {
    public String largestNumber(int[] nums) {
        String [] temp = new String[nums.length];
        int index = 0;
        for(int i:nums)
            temp[index++] = String.valueOf(i);
        
        Arrays.sort(temp,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                String first = a+b;
                String sec = b+a;
                return sec.compareTo(first);
            }
        });
        if(temp[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String ss:temp) sb.append(ss);
        return sb.toString();
    }
}