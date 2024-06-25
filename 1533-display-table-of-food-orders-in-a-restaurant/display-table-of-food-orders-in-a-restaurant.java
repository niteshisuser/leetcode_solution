class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<String,Integer> temp;
        Set<String>foodItem = new TreeSet();
        TreeMap<Integer,Map<String,Integer>> map = new TreeMap();
        for(List<String> list: orders){
            int tableNumber = Integer.parseInt(list.get(1));
            temp = map.get(tableNumber);
            //System.out.println("Temp:"+temp);
            if(temp == null){
                temp = new TreeMap();
                temp.put(list.get(2),1);
                foodItem.add(list.get(2));
            }
            else{
                //temp.put(list.get(2),1+temp.get(list.get(2)));
                String item = list.get(2);
                foodItem.add(item);
                temp.put(item,temp.containsKey(item)?1+temp.get(item):1);
            }
            map.put(tableNumber,temp);  
            //System.out.println("Map:"+map);
        }
        List<List<String>> result = new ArrayList();
        
        List<String> cur = new ArrayList();
        cur.add("Table");
        for(String s:foodItem) cur.add(s);
        result.add(cur);
        
        //Now get all the table items and quantity 
        for(int i:map.keySet()){
            cur = new ArrayList();
            cur.add(i+"");

            temp = map.get(i);
            for(String s:foodItem){
                cur.add(temp.containsKey(s)?""+temp.get(s):"0");
            }
            result.add(cur);

        }
        return result;
        
    }
}