class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;
        List<Boolean> ans = new ArrayList();
        for(int i=0;i<n;i++){
            int m = r[i]-l[i]+1;
            int arr[] = new int[m];
            int start = l[i];
            for(int j=0;j<m;j++){
                arr[j] = nums[start++];
            }
            Arrays.sort(arr);
            //for(int iu:arr) System.out.print(iu + "");
            //System.out.println();
            if(arr.length<=2) ans.add(true);
            else {
                int d = arr[1]-arr[0];
                int k=2;
                for(;k<arr.length;k++){
                    if(arr[k]-arr[k-1]!=d){
                        //ans.add(false);
                        break;
                    }
                }
                ans.add(k==arr.length);
            }
        }
        return ans;
    }
}