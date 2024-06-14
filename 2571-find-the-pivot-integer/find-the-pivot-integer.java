class Solution {
    public int pivotInteger(int n) {
        if(n==1)
        return 1;

        int total = sum(n);
        int s =1;
        int e =n;
        while(s<e){

            int mid = (s+e)/2;
            int sum = sum(mid);
            if(sum==(total-sum+mid))
            return mid;

            if(sum>(total-sum+mid))
            e=mid-1;
            else
            s=mid+1;

        }
        return -1;
    }

   public int sum(int n){
    double nn=n;
      return (int)((nn/2)*(2+(nn-1)*1));
    }
}