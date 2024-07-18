class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int r[] = new int[51];
        for(int a[]:ranges){
            for(int i=a[0];i<=a[1];i++) r[i]++;
        }
        for(int i=left;i<=right;i++)
            if(r[i]==0) 
                return false;
        return true;
    }
}