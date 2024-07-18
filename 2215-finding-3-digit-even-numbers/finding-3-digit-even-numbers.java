class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[10];
        for(int val: digits) count[val]++;
        
        
        for(int first=1;first<=9;first++){
            count[first]--;
            for(int second=0;second<=9;second++){
                count[second]--;
                for(int third=0;third<=8;third+=2){
                    count[third]--;
                    
                    if(count[first]>=0 && count[second]>=0 && count[third]>=0)
                        list.add(first*100+second*10+third);
                    
                    count[third]++;
                }
                count[second]++;
            }
            count[first]++;
        }
        
        
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++)
            res[i] = list.get(i);
        return res;
    }
}