class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> keys = new Stack();
        keys.add(0);
        while(!keys.isEmpty()){
            int key = keys.pop();
            for(int i:rooms.get(key)){
                if(!seen[i]){
                    seen[i]=true;
                    keys.add(i);
                }
            }
        }

        for(boolean visited:seen) 
            if(!visited)
                return false;

        return true;
    }
}