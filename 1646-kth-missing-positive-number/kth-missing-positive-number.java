class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 10001;
        int num[] = new int [n];
        int ar = arr.length;
        for(int i:arr){
            num[i]++;
        }
        int index = 0;
        for(int i=1;i<n;i++){
            if(num[i]==0) index++;
            if(index==k) return i;
        }
        return -1;
    }
}