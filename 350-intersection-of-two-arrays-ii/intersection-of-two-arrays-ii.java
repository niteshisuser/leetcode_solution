import java.io.*;
class Solution {
    int min(int a,int b){
        return a<b?a:b;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
        1->2
        2->2

        2->2
        */
        int MAX = 1001;
        int [] n1 = new int[MAX];
        int [] n2 = new int[MAX];
        for(int i:nums1) n1[i]++;
        for(int i:nums2) n2[i]++;
        List<Integer> ans = new ArrayList();
        for(int i=0;i<MAX;i++){
            if(n1[i]>0 && n2[i]>0){
                for(int j=0;j<min(n1[i],n2[i]);j++)
                    ans.add(i);
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}