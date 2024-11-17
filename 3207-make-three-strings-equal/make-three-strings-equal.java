class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int s1L = s1.length();
        int s2L = s2.length();
        int s3L = s3.length();
        int i=0,j=0,k=0;
        int count  = 0;
        while(i<s1L && j<s2L && k<s3L){
            if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j) == s3.charAt(k)){
                count ++;
                i++;
                j++;
                k++;
            }
            else break;
        }
        //int max = getMax(s3L,getMax(s1L,s2L));
        if(count==0) return -1;
        return s1L + s2L + s3L -3*count;
    }
}