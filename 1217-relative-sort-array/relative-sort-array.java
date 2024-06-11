class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int map[] = new int[1001];
        for(int i:arr1) map[i]++;
        int index = 0;
        for(int i:arr2){
            if(map[i]>0){
                for(int j=0;j<map[i];j++){
                    arr1[index++] = i;
                }
            }
            //Reset to zero
            map[i]=0;
        }
        for(int i=0;i<=1000;i++){
            if(map[i]>0){
                for(int j=0;j<map[i];j++){
                    arr1[index++] = i;
                }
            }
        }
        return arr1;
    }
}