class Solution 
{
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        List<List<Integer>>outer=new ArrayList<>();
        int arr[]=new int[201];
        int i,k=0;
        for(int ii:nums) arr[ii]++;
        while(k<=nums.length)
        {
          List<Integer>inner=new ArrayList<>();
          k++;
          for(i=1;i<201;i++)
          {
            if(arr[i]!=0)
            {
               inner.add(i);
               arr[i]--;
            }
          }
          if(inner.size()>0)
          outer.add(inner);
        }
        return outer;
    }
}